package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = findViewById(R.id.myButton);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "We clicked on Kyckling!");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", "Smak"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);
            }

        });



    }
}
