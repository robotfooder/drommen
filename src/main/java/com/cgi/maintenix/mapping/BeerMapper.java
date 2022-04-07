package com.cgi.maintenix.mapping;

import com.cgi.maintenix.model.Beer;
import com.cgi.maintenix.spec.BeerSpec;

public class BeerMapper {
    public static BeerSpec map(Beer beer) {

        return BeerSpec.builder()
                .name(beer.getName())
                .alcohol(beer.getAlcohol() + " Vol %")
                .price(Math.round(beer.getCustomerPrice()) + " Kr")
                .brand(beer.getBrand().getBrandName())
                .size(beer.getSizeCL() + " CL")
                .type(beer.getType().name())
                .ypk(Math.round(beer.getYpk()))
                .build();
    }
}
