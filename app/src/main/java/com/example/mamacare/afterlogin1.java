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
        if (mdisease == "cough")
        {
            Intent intent1 = new Intent(afterlogin1.this,fever.class);
            startActivity(intent1);
        }
        else {
            Intent intent2 =new Intent(afterlogin1.this,wirell.class);
            startActivity(intent2);

        }
    }
}