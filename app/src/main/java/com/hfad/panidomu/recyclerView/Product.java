package com.hfad.panidomu.recyclerView;

import com.hfad.panidomu.R;

public class Product {

    private String title;
    private String price;
    private String description;
    private String imageResource;

    public Product(String title, String price, String description, String imageResource) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageResource() {
        return imageResource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }
}
