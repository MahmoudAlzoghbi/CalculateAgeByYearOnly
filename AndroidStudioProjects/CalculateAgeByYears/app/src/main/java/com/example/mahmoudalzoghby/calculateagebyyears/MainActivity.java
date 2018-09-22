package com.example.mahmoudalzoghby.calculateagebyyears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetAge(View view) {
        EditText object = (EditText) findViewById(R.id.enter_age);
        int YearOfBirth = Integer.parseInt(object.getText().toString());

        int Age = 2018 - YearOfBirth;

        Toast.makeText(this,"Age: " + String.valueOf(Age) , Toast.LENGTH_LONG).show();
    }
}
