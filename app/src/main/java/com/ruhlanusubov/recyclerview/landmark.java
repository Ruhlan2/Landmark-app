package com.ruhlanusubov.recyclerview;

import java.io.Serializable;

public class landmark implements Serializable {

    String name,country;
    int image;

    //Constructor

    public landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
