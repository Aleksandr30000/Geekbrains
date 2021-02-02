package ru.geekbrains.lesson_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button button21;
    Button button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button21 = findViewById(R.id.button21);
        button21.setOnClickListener(this);

        button23 = findViewById(R.id.button23);
        button23.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button21) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button23) {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
    }
}