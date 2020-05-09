package com.meyuyw.mypresident;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.ViewHolder> {
    Context context;
    ArrayList<President> listPresident;

    public PresidentAdapter(Context context, ArrayList<President> listPresident) {
        this.context = context;
        this.listPresident = listPresident;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_president, viewGroup, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.ava.setImageResource(getListPresident().get(i).getImage());
        viewHolder.name.setText(getListPresident().get(i).getName());
        viewHolder.profil.setText(getListPresident().get(i).getProfil());
    }

    @Override
    public int getItemCount() {

        return listPresident.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView profil;
        ImageView ava;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            profil = itemView.findViewById(R.id.tv_profil);
            ava = itemView.findViewById(R.id.civ_ava);
        }
    }
}
