package com.example.appbansch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText mUserName, mPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btnLG).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.tvForgotPass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,ForgotPass.class);
                startActivity(intent);
            }
        });
        mUserName= (EditText) findViewById(R.id.edtUserName);
        mPass =(EditText) findViewById(R.id.edtPass);
        findViewById(R.id.btnLG).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mUserName.getText().toString();
                String pass = mPass.getText().toString();

                if(name.equals("admin") && pass.equals("admin123"))
                {
                    Intent i = new Intent(Login.this,Admin.class);
                    startActivity(i);
                }
                else
                {
                    Intent intent = new Intent(Login.this,Home.class);
                    startActivity(intent);
                }
            }
        });
    }
}