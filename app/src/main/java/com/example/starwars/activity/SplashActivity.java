package com.example.starwars.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.starwars.databinding.ActivitySplashBinding;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

  private ActivitySplashBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivitySplashBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    onRedirectHome();
  }

  private void onRedirectHome() {
    new Handler(Looper.getMainLooper()).postDelayed(() -> startActivity(new Intent(SplashActivity.this, HomeActivity.class)), 1200);
  }
}