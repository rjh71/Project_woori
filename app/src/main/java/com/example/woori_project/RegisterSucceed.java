package com.example.woori_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegisterSucceed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_succeed);

        Spinner spinner = findViewById(R.id.spinner_character);

        String[] arrayData = getResources().getStringArray(R.array.alphabet_array);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                arrayData);
        spinner.setAdapter(arrayAdapter);
    }
}