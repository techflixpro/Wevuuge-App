package com.techflixpro.wevuuge;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String description;
    private String price;
    private String ImageURL;
    private String ImageName;
    public TravelDeal(){}

    public TravelDeal(String title, String description, String price, String ImageURL, String ImageName) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
        this.setImageURL(ImageURL);
        this.setImageURL(ImageName);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle(String s) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription(String s) {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice(String s) {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }
}
