package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Button ok=(Button)findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
    });
        NewsListApplication app = (NewsListApplication) getApplicationContext();
        String login = app.getLogin();
        TextView nom=(TextView)findViewById(R.id.nom);
        nom.setText("Vous êtes connecté en tant que "+login);
}
}