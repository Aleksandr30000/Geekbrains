package ru.geekbrains.lesson_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    Button button31;
    Button button32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button31 = findViewById(R.id.button31);
        button31.setOnClickListener(this);

        button32 = findViewById(R.id.button32);
        button32.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button31) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button32) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    }
}