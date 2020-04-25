package com.waqas.wallstreetbets.ui.indices;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.waqas.wallstreetbets.Model;
import com.waqas.wallstreetbets.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IndicesFragment extends Fragment {

    ArrayList<Model> models = new ArrayList<>();
    RetrofitAdapter retrofitAdapter;
    DatePickerDialog picker;
    RecyclerView indicesRecycle;
    TextView dateText;
    String date;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_indices, container, false);

        dateText = root.findViewById(R.id.dateText);

        indicesRecycle = root.findViewById(R.id.recyclerStock);
        indicesRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        indicesRecycle.setAdapter(new RetrofitAdapter(getContext(),models));
//        getIndicesResponse();

        if(savedInstanceState == null){
            date = "2020-02-14";
            getIndicesResponse(date);
        }else{
            date = savedInstanceState.getString("date");
            dateText.setText(date);
            getIndicesResponse(date);
        }

        dateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                picker = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                dateText.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                                date = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
                                getIndicesResponse(date);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
        return root;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("date", date);
    }

    private void getIndicesResponse(String date){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.205:5000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface rInterface = retrofit.create(RequestInterface.class);
        Call<List<Model>> call = rInterface.getIndicesData(date);
//        This code allows the retrofit library to run on the background thread instead of the main.
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                models = new ArrayList<>(response.body());
                retrofitAdapter = new RetrofitAdapter(getActivity(), models);
                indicesRecycle.setAdapter(retrofitAdapter);

                dateText.setText(models.get(0).getDate_Inserted().toString());
//                Toast.makeText(getContext(), "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
                System.out.println(t);
            }
        });
    }
}
