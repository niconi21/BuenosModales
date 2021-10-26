package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGracias, btnEstornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGracias = (Button)findViewById(R.id.btnGracias);
        btnGracias.setOnClickListener(listenerGracias);

        btnEstornudar = (Button)findViewById(R.id.btnEstornudar);
        btnEstornudar.setOnClickListener(listenerEstornudar);

    }

    private View.OnClickListener listenerGracias = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, R.string.txt_gracias, Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener listenerEstornudar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, R.string.txt_estornudar, Toast.LENGTH_SHORT).show();
        }
    };

}