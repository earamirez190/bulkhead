package com.example.bulkhead.dto;


public class ReviewDto {

    private String userFirstname;
    private String userLastname;
    private int productId;
    private int rating;
    private String comment;

    public ReviewDto() {
    }

    public ReviewDto(String userFirstname, String userLastname, int productId, int rating, String comment) {
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
        this.productId = productId;
        this.rating = rating;
        this.comment = comment;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public int getProductId() {
        return productId;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}