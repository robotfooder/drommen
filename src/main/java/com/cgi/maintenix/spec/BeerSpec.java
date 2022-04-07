package com.cgi.maintenix.spec;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Introspected
public class BeerSpec {
    private String brand;
    private String name;
    private String price;
    private String alcohol;
    private String type;
    private float ypk;
    private String size;
}
