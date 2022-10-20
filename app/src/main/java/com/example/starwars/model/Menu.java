package com.example.starwars.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Menu {
  private Drawable image;
  private String title;

  public Menu(Drawable image, String title) {
    this.image = image;
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) { this.title = title; }

  public Drawable getImage() {
    return image;
  }

  public void setImage(ImageView imageView) { this.image = image; }
}
