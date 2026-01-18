package com.mwanza.rest_services;

import lombok.Data;

@Data
public class Details {
    private int id;
    private String name;

    public Details(int id, String name){
        this.id = id;
        this.name = name;
    }
}
