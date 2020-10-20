package com.example.tp5;

        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class ContactActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Hochart","Jimmy","https://media-exp1.licdn.com/dms/image/C4D03AQG8abkO2rOFDA/profile-displayphoto-shrink_200_200/0?e=1608768000&v=beta&t=AJpPyjjXxwxEBfLcJp-LsACpm6zN5xY2PJlG-sCuO3w"));
        contacts.add(new Contact("Badeuille","Paul","https://media-exp1.licdn.com/dms/image/C4D03AQE6xxOmtdP0pg/profile-displayphoto-shrink_200_200/0?e=1608768000&v=beta&t=GxTwKMUtm_yhqr4tzddaYAWIjNHlmzETQZEyGSSU6rk"));
        contacts.add(new Contact("Radenne","Gabrielle","https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/72714016_1337064389800981_317061366328328192_o.jpg?_nc_cat=102&_nc_sid=09cbfe&_nc_ohc=OJYA47k-XNcAX88f1N7&_nc_oc=AQlyzsYR97aWTaOuypU5zx2EDFMY2XP0-QQ59C4EYOu_18lZ7Ckwxh6ZAUndEunR7Ig&_nc_ht=scontent-cdg2-1.xx&oh=d877360f322782e316cec4bb588df162&oe=5FB2A1FF"));
        contacts.add(new Contact("Landrieu","Pioutoine","https://scontent-cdg2-1.xx.fbcdn.net/v/t31.0-8/11427887_128706450794135_4148684143882430205_o.jpg?_nc_cat=100&_nc_sid=09cbfe&_nc_ohc=JBYsJQ2bC_gAX8CZ12c&_nc_ht=scontent-cdg2-1.xx&oh=2dbf9ae609be47348e454bace316ab9d&oe=5FB43240"));
        contacts.add(new Contact("Richard","Coeur de Lion","toto"));

        ContactsAdapter adapter = new ContactsAdapter(contacts,this);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));


    }
}
