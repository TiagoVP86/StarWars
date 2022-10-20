package com.example.starwars.activity;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starwars.R;
import com.example.starwars.adapter.Adapter;
import com.example.starwars.databinding.ActivityHomeBinding;
import com.example.starwars.model.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

  private ActivityHomeBinding binding;
  private final List<Menu> menuList = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityHomeBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    getWindow().setStatusBarColor(Color.BLACK);

    //listagem
    createList();

    //configurar adapter
    Adapter adapter = new Adapter(menuList, this);

    // configurar recyclerView
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
    binding.recyclerView.setLayoutManager(layoutManager);
    binding.recyclerView.setAdapter(adapter);
  }

  private void createList(){
    Menu menu = new Menu(ContextCompat.getDrawable(this, R.drawable.starship), "Buscar ESPAÇONAVES");
    this.menuList.add(menu);

    menu = new Menu(ContextCompat.getDrawable(this, R.drawable.planet), "Buscar PLANETAS");
    this.menuList.add(menu);

    menu = new Menu(ContextCompat.getDrawable(this, R.drawable.luke), "Buscar PERSONAGENS");
    this.menuList.add(menu);

    menu = new Menu(ContextCompat.getDrawable(this, R.drawable.darthvader), "Busca ALEATÓRIA");
    this.menuList.add(menu);

    menu = new Menu(ContextCompat.getDrawable(this, R.drawable.ic_settings), "CONFIGURAÇÕES");
    this.menuList.add(menu);

    menu = new Menu(ContextCompat.getDrawable(this, R.drawable.ic_music), "REPRODUZIR SOM CLÁSSICO DO FILME");
    this.menuList.add(menu);
  }
}