package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.roll_button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = (int)(Math.random()*6); //Generate a value between 0 and 6
                //Toast toast = Toast.makeText(MainActivity.this, ""+number, Toast.LENGTH_SHORT).show(); //Send number in a toast for debuging
                final TextView resultView = (TextView) findViewById(R.id.result); //Find the TextView in the
                resultView.setText(""+number);
            }
        });
    }


}