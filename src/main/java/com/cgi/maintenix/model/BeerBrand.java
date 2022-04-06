package com.cgi.maintenix.model;

import lombok.Getter;

public enum BeerBrand {
    CARLSBERG("Carlsberg"),
    MODELO("Modelo"),
    STIEGL("Stiegl"),
    JAMTLAND("Jämtlands Bryggeri"),
    REINKLOU("Reinklou"),
    ARBOGA("Arboga"),
    KRONENBOURG("Kronenbourg");


    @Getter
    private final String brandName;

    BeerBrand(String brandName) {
        this.brandName=brandName;
    }
}
