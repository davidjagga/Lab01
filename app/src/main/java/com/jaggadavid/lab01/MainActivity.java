package com.jaggadavid.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count+=4;
                System.out.println("incrementing: " + count);
                Log.i("incrementing", count+"");
                greetingDisplay.setText(count+"");

            }
        });
    }

    public void decrement(View view) {
        count -=3;
        System.out.println("decrementing: " + count);
        Log.i("decrementing", count+"");
        greetingDisplay.setText(count+"");
    }

    public void restart(View view) {
        count =0;
        System.out.println("restart: " + count);
        Log.i("restart", count+"");
        greetingDisplay.setText(count+"");
    }

    public void times_2(View view) {
        count *= 2;
        System.out.println("Multiplying by 2: " + count);
        Log.i("Multiplying by 2", count+"");
        greetingDisplay.setText(count+"");
    }
}