package com.company;

public class Dog extends Pet {


    private boolean likesWalks;
    private boolean canFetch;

    public Dog(boolean likesWalks, boolean canFetch, String coatType) {
        this.likesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;
    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    private String coatType;





}
