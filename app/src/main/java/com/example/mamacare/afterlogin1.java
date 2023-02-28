package com.example.mamacare;

import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class afterlogin1 extends AppCompatActivity {
    private Button button;
    private EditText disease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin1);
        button = (Button)findViewById(R.id.button);
        disease = (EditText)findViewById(R.id.disease);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(disease.getText().toString());
            }
        });
    };


    private void validate(String mdisease)
    {
        if (mdisease.equals("cough"))
        {
            Intent intent3 = new Intent(afterlogin1.this,wirell.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("Cough")) {
            Intent intent3 =new Intent(afterlogin1.this,wirell.class);
            startActivity(intent3);

        }
        else if(mdisease.equals("headache"))
        {
            Intent intent3 = new Intent(afterlogin1.this,Headache.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("Headache"))
        {
            Intent intent3 = new Intent(afterlogin1.this,Headache.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("Cold"))
        {
            Intent intent3 = new Intent(this,Cold.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("cold"))
        {
            Intent intent3 = new Intent(this,Cold.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("stomach ache"))
        {
            Intent intent3 = new Intent(this,Stomachache.class);
            startActivity(intent3);
        }
        else if(mdisease.equals("Stomach ache"))
        {
            Intent intent3 = new Intent(this,Stomachache.class);
            startActivity(intent3);
        }
        else {
            Intent intent3 = new Intent(afterlogin1.this,fever.class);
            startActivity(intent3);
        }
    }
}