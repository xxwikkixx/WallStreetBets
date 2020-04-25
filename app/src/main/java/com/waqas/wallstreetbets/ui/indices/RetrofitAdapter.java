package com.waqas.wallstreetbets.ui.indices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.waqas.wallstreetbets.Model;
import com.waqas.wallstreetbets.R;

import java.util.ArrayList;


public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.ViewHolder> {
    private ArrayList<Model> models = new ArrayList<>();
    private Context context;

    public RetrofitAdapter(Context context, ArrayList<Model> models){
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_layout, parent, false);
        return new RetrofitAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.symbolTitle.setText(models.get(position).getSymbol());
        holder.tickerType.setText(models.get(position).getType());
        holder.strike.setText(models.get(position).getStrike().toString());
        holder.exp.setText(models.get(position).getExp_Date());
        holder.oi.setText(models.get(position).getOpen_Int().toString());
        holder.vol.setText(models.get(position).getVolume().toString());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView symbolTitle, tickerType, strike, exp, oi, vol;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            symbolTitle = itemView.findViewById(R.id.tickerTitle);
            tickerType = itemView.findViewById(R.id.tickerType);
            strike = itemView.findViewById(R.id.strike);
            exp = itemView.findViewById(R.id.expiry);
            oi = itemView.findViewById(R.id.openInt);
            vol = itemView.findViewById(R.id.volume);
        }
    }
}
