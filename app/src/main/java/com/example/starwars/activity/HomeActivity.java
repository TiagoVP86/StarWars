package com.example.starwars.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.starwars.adapter.Adapter;
import com.example.starwars.databinding.ActivityHomeBinding;
import com.example.starwars.databinding.ActivitySplashBinding;
import com.example.starwars.model.Object;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

  private ActivityHomeBinding binding;
  private RecyclerView recyclerView;
  private List<Object> list = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityHomeBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    getSupportActionBar().hide();
    
    recyclerView = binding.recyclreView;

    //listagem
    createList();

    //configurar adapter
    Adapter adapter = new Adapter();

    // configurar recyclerView
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);
    recyclerView.setAdapter(adapter);
  }

  private void createList(){
    List list = new List();

  }

}