package com.waqas.wallstreetbets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    AutoCompleteTextView username;
    EditText pass;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            loginButton = (Button) findViewById(R.id.user_sign_in_button);
            username = (AutoCompleteTextView) findViewById(R.id.username);
            pass = (EditText) findViewById(R.id.password);
            
            databaseHelper = new DatabaseHelper(LoginActivity.this);
            
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isExist = databaseHelper.checkUserExist(username.getText().toString(), pass.getText().toString());
                    if(isExist){
                        loginUser();
                    }else {
                        pass.setText(null);
                        Toast.makeText(LoginActivity.this, "Login Failed. Invalid usename or password", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    public void loginUser(){
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
