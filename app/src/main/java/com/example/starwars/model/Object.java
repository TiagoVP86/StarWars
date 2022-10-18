package com.example.starwars.model;

import android.widget.ImageView;

public class Object {
  private String title;
  private ImageView imageView;

  public Object(String title, ImageView imageView) {
    this.title = title;
    this.imageView = imageView;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ImageView getImageView() {
    return imageView;
  }

  public void setImageView(ImageView imageView) {
    this.imageView = imageView;
  }
}
