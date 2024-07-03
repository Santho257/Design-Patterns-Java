package com.santho.proxypattern.design;

public class Video {
    private String name;
    private boolean ageRestricted;

    public Video(String name, boolean ageRestricted) {
        this.name = name;
        this.ageRestricted = ageRestricted;
    }

    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playVideo(){
        System.out.println(this.name + " is playing...");
    }

    public boolean isAgeRestricted() {
        return ageRestricted;
    }

    public void setAgeRestricted(boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
    }
}
