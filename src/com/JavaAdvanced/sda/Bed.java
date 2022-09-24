package com.JavaAdvanced.sda;

public class Bed {
    String name;
    String bedroomType;

    public Bed (String name, String bedroomType){
        this.name = name;
        this.bedroomType = bedroomType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType;
    }

    public String getBedroomType() {
        return bedroomType;
    }
}
