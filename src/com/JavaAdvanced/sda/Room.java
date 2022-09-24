package com.JavaAdvanced.sda;

public class Room {
    private Bed bed;
    private TV tv;


    public Room (Bed bed, TV tv){
        this.bed = bed;
        this.tv = tv;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Bed getBed() {
        return bed;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }
}



