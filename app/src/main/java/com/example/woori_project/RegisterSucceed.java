package com.example.woori_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterSucceed extends AppCompatActivity {

    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_succeed);

        btn_next = findViewById(R.id.register_next_btn);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login_Basic.class);
                startActivity(intent);
            }
        });

        Spinner spinner = findViewById(R.id.spinner_character);

        String[] arrayData = getResources().getStringArray(R.array.alphabet_array);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                arrayData);
        spinner.setAdapter(arrayAdapter);




    }
}