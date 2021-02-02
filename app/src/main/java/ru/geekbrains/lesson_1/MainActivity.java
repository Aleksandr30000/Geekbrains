package ru.geekbrains.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button12;
    Button button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(this);

        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button12) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.button13) {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
    }
}