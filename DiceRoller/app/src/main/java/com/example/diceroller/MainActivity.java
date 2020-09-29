package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                EditText faces = (EditText) findViewById(R.id.faces); //Find the EditText in the layout
                int numberFaces;
                try{
                    numberFaces = Integer.parseInt(faces.getText().toString());
                }
                catch (NumberFormatException e){
                    numberFaces=0;
                }
                if(numberFaces > 0 && numberFaces <2000)
                {
                    int number = (int)(Math.random()*numberFaces)+1; //Generate a value between 0 and 6
                    //Toast toast = Toast.makeText(MainActivity.this, ""+number, Toast.LENGTH_SHORT).show(); //Send number in a toast for debuging
                    TextView resultView = (TextView) findViewById(R.id.result); //Find the TextView in the layout
                    TextView resultView2 = (TextView) findViewById(R.id.result2); //Find the TextView in the layout
                    resultView.setText("Dé 1 : "+number); //Set the text value of a TextView
                    number = (int)(Math.random()*numberFaces)+1;
                    resultView2.setText("Dé 2 : "+number);//Set the text value of a TextView
                }else
                {
                    Toast.makeText(MainActivity.this, "Choisisez un nombre de faces réaliste !", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}