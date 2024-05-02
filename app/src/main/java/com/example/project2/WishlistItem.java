package com.example.project2;

public class WishlistItem {
    private String name;
    private String price;
    private String url;

    public WishlistItem(String name, String price, String url) {
        this.name = name;
        this.price = price;
        this.url = url;
    }

    // Getters and setters for the properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}