package com.example.calibrivinyls.model;

public class Album {
    private Long id;
    private String name;
    private String artist;
    private String genre;
    private double price;
    private String image_Url;
    private String description; 

    public Album() {
}
    public Album(Long id, String name, String artist, String genre, double price, String image_url, String description) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.image_Url = image_url;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public String getImage_Url() {
        return image_Url;
    }

    public String getDescription() {
        return description;
    }
}