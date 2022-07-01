package com.example.woori_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.woori_project.FragmentMyGreen;
import com.example.woori_project.FragmentMyReport;

public class GroupFragment extends AppCompatActivity {

    private FragmentMyReport fragmentMyReport;
    private FragmentMyGreen fragmentMyGreen;
    private Button btnMyGreen;
    private Button btnMyReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_fragment);

        fragmentMyGreen = new FragmentMyGreen();
        fragmentMyReport = new FragmentMyReport();

        // Get Fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Get Fragment Transaction
        // Transaction : Fragment를 올리거나 교체하는 작업

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment_group, fragmentMyGreen);

        fragmentTransaction.commit();

        btnMyGreen = findViewById(R.id.btn_to_myGreen);
        btnMyReport = findViewById(R.id.btn_to_myReport);

        btnMyGreen.setOnClickListener(v -> {
            FragmentManager fm1 = getSupportFragmentManager();
            FragmentTransaction ft1 = fragmentManager.beginTransaction();

            ft1.replace(R.id.fragment_group, fragmentMyGreen);
            ft1.commit();
        });

        btnMyReport.setOnClickListener(v -> {
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fragmentManager.beginTransaction();

            ft2.replace(R.id.fragment_group, fragmentMyReport);
            ft2.commit();
        });


    }
}