package com.example.eserciziogitteam5bi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void messaggio(View v){
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,"ciao sono brenci",duration);
        toast.show();
    }

}