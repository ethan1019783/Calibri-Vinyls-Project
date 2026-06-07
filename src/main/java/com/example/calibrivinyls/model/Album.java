package com.example.calibrivinyls.model;

public class Album {
    private Long id;
    private String name;
    private String artist;
    private String genre;
    private double price;
    private String imageUrl;
    private String description; 

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Album() {

}
    public Album(Long id, String name, String artist, String genre, double price, String imageUrl, String description) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.imageUrl = imageUrl;
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

    public String getimageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}