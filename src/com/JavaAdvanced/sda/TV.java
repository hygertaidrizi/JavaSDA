package com.JavaAdvanced.sda;

public class TV {
    String type;
    int size;

    public TV (String type, int size){
        this.type = type;
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
