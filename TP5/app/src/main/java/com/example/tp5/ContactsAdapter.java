package com.example.tp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    private final List<Contact> mContacts;
    private final Context moncontext;

    public ContactsAdapter(List<Contact> contacts, Context context) {
        mContacts = contacts;
        moncontext = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);
        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getmFirstName());
        TextView lastNameTextView = holder.lastNameTextView;
        lastNameTextView.setText(contact.getmLastName());
        ImageView photoImage = holder.photoImageView;
        Glide.with(moncontext).load(contact.getImageUrl()).override(400,400).into(photoImage);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ImageView photoImageView;
        public ViewHolder(View itemView){
            super(itemView);
            firstNameTextView = (TextView) itemView.findViewById(R.id.contact_firstname);
            lastNameTextView = (TextView) itemView.findViewById(R.id.contact_lastname);
            photoImageView = (ImageView) itemView.findViewById(R.id.image);

        }

    }

}
