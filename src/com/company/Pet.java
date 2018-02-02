package com.company;

public class Pet {
    public Pet(String ownerName, String petName, String homeAddress, int age, char gender, boolean sound) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.homeAddress = homeAddress;
        this.age = age;
        this.gender = gender;
        Sound = sound;
    }

    private String ownerName;
    private String petName;
    private String homeAddress;
    private int age;
    private char gender;
    private boolean Sound;

    public boolean isSound() {
        return Sound;
    }

    public void setSound(boolean sound) {
        Sound = sound;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;











    }
}

