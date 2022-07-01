package com.example.woori_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Select_menu extends AppCompatActivity {

    ImageButton btn_myReport;
//    ImageButton btn_myGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        btn_myReport = findViewById(R.id.btn_myReport);

        btn_myReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GroupFragment.class);
                startActivity(intent);
            }
        });

//        btn_myGreen = findViewById(R.id.btn_myGreen);
//
//        btn_myReport.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), GroupFragment.class);
//                startActivity(intent);
//            }
//        });


    }
}