package com.example.group4calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView radius;

    Integer r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonCalculate);
        radius = (TextView) findViewById(R.id.editTextTextenterRadius);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String Radius =radius.getText().toString();
                        Toast.makeText(MainActivity.this, "Radius is: "+Radius, Toast.LENGTH_SHORT).show();

                        if (Radius.trim().equals("")) {
                            Toast.makeText(MainActivity.this, "Please enter your radius!", Toast.LENGTH_SHORT).show();

                        }else {
                            r =  Integer.parseInt(radius.getText().toString());
                            double result = Math.PI * r * r;

                            String area = Double.toString(result);
                            Toast.makeText(MainActivity.this, "The Area is :"+area, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}