package com.example.tp5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Jean","Pierre","toto"));
        contacts.add(new Contact("Jeanne","D'arc","toto"));
        contacts.add(new Contact("Pierre","Menez","toto"));
        contacts.add(new Contact("Arthur","Rimbaut","toto"));
        contacts.add(new Contact("Richard","Coeur de Lion","toto"));

        ContactsAdapter adapter = new ContactsAdapter(contacts);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));


    }
}
