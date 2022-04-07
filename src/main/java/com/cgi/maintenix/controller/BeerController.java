package com.cgi.maintenix.controller;

import com.cgi.maintenix.mapping.BeerMapper;
import com.cgi.maintenix.model.Beer;
import com.cgi.maintenix.service.Bar;
import com.cgi.maintenix.spec.BeerSpec;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/beers")
public class BeerController {

    @Inject
    Bar bar;



    @Get(produces = MediaType.APPLICATION_JSON)
    public List<BeerSpec> getBeers() {
        return bar.getBeers().stream().map(this::map).collect(Collectors.toList());

    }

    private BeerSpec map(Beer beer) {
        return BeerMapper.map(beer);
    }
}
