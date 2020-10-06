package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setTitle(getLocalClassName());
        Button login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nom=(EditText)findViewById(R.id.nom);
                Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
                NewsListApplication app = (NewsListApplication) getApplicationContext();
                app.setLogin(nom.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}