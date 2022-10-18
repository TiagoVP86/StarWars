package com.example.starwars.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starwars.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
    return new MyViewHolder(item);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.title.setText("Buscar ESPAÇONAVES");
    holder.image.setImageResource(R.drawable.darthvader);
  }

  @Override
  public int getItemCount() {
    return 5;
  }

  public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView title;
    ImageView image;

    public MyViewHolder(@NonNull View itemView) {
      super(itemView);

      title = itemView.findViewById(R.id.title);
      image = itemView.findViewById(R.id.image);
    }
  }

}
