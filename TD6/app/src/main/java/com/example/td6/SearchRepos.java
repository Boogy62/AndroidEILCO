package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SearchRepos extends AppCompatActivity {
    List<ListeRepo> liste = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GithubService githubService = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);
/*
        githubService.listRepos("adrienbusin").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                afficherRepos(response.body());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }
        });*/

        githubService.searchRepos(getIntent().getStringExtra("recherche")).enqueue(new Callback<Repos>() {
            @Override
            public void onResponse(Call<Repos> call, Response<Repos> response) {
                afficherListeRepos(response.body());
            }

            @Override
            public void onFailure(Call<Repos> call, Throwable t) {
            }
        });
    }

    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots : "+repos.size(), Toast.LENGTH_SHORT).show();
    }
    public void afficherListeRepos(Repos repos) {
        RecyclerView rvRepos = (RecyclerView) findViewById(R.id.rvRepos);
        repos.getItems().forEach((k)->liste.add(new ListeRepo(k.getHtml_url(),k.getName())));
        ReposAdapter adapter = new ReposAdapter(liste,this);
        rvRepos.setAdapter(adapter);
        rvRepos.setLayoutManager(new LinearLayoutManager(this));

    }

}
