package com.interfaz.hardel.sivarportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.google.ar.core.examples.unity.helloar.UnityPlayerActivity;
import android.os.Bundle;

public class bridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
