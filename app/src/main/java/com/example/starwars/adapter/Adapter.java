package com.example.starwars.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starwars.R;
import com.example.starwars.model.Menu;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

  private final List<Menu> menuList;
  private final Context context;

  public Adapter(List<Menu> menuList, Context context) {
    this.menuList = menuList;
    this.context = context;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
    return new MyViewHolder(itemList);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Menu menu = menuList.get(position);
    holder.title.setText(menu.getTitle());
    holder.image.setImageDrawable(menu.getImage());
    if(menu.getTitle().equals("Busca ALEATÓRIA")) {
      holder.color.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_home_epecial));
    }
  }

  @Override
  public int getItemCount() { return menuList.size(); }

  public static class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView image;
    TextView title;
    View color;

    public MyViewHolder(@NonNull View itemView) {
      super(itemView);

      image = itemView.findViewById(R.id.image);
      title = itemView.findViewById(R.id.title);
      color = itemView.findViewById(R.id.cl_background);
    }
  }
}
