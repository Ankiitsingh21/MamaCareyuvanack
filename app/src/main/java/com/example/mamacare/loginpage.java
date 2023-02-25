package com.example.mamacare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginpage extends AppCompatActivity {
     private View move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        move=findViewById(R.id.login);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ihome=new Intent(loginpage.this,afterlogin1.class);
                startActivity(ihome);
            }
        });
    };
}