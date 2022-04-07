package com.cgi.maintenix.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Beer {
    private String name;
    private BeerBrand brand;
    private BeerType type;
    private float grossPrice;
    private float customerPrice;
    private float alcohol;
    private float ypk;
    private int quantity;
    @Builder.Default
    private int sizeCL = 33;

    public static BeerBuilder builder() {
        return new CustomBeerBuilder();
    }

    public static class CustomBeerBuilder extends BeerBuilder {
        @Override
        public Beer build() {
            Beer beer = super.build();
            beer.setYpk((beer.sizeCL * beer.alcohol) / beer.grossPrice);
            return beer;
        }
    }

}
