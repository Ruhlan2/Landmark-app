package com.ruhlanusubov.recyclerview;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ruhlanusubov.recyclerview.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.Landmarkholder> {

    ArrayList<landmark> landmarkArrayList;

    public adapter(ArrayList<landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    //connection
    public Landmarkholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new Landmarkholder(recyclerRowBinding);
    }
        //process
    @Override
    public void onBindViewHolder(@NonNull Landmarkholder holder,int position) {
        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);
                //intent.putExtra("landmark",landmarkArrayList.get(position));
                Singleton singleton=Singleton.getInstance();
                singleton.setSentlandmark(landmarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }
//number of xml
    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class Landmarkholder extends RecyclerView.ViewHolder{

       private  RecyclerRowBinding binding;

        public Landmarkholder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
