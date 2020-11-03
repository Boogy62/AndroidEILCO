package com.example.td6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.td6.ListeRepo;

import java.util.List;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder>{
    private final List<ListeRepo> mRepo;
    private final Context moncontext;

    public ReposAdapter(List<ListeRepo> repos, Context context) {
        mRepo = repos;
        moncontext = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.repos,parent,false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListeRepo repo = mRepo.get(position);
        TextView NameTextView = holder.NameTextView;
        NameTextView.setText(repo.getName());
        TextView urlTextView = holder.urlTextView;
        urlTextView.setText(repo.getHtml_url());
    }

    @Override
    public int getItemCount() {
        return mRepo.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView NameTextView;
        public TextView urlTextView;
        public ViewHolder(View itemView){
            super(itemView);
            NameTextView = (TextView) itemView.findViewById(R.id.name);
            urlTextView = (TextView) itemView.findViewById(R.id.url);

        }

    }

}
