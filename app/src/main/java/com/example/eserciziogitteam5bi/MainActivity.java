package com.example.eserciziogitteam5bi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText testo;
        int duration = Toast.LENGHT_LONG;
        Toast toast = Toast.makeText(context, testo.getText(), duration);
        toast.show();

    }

}