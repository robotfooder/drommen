package com.cgi.maintenix.service;

import com.cgi.maintenix.model.Beer;
import com.cgi.maintenix.repository.BeerRepo;
import jakarta.inject.Singleton;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class DrommenBarService implements Bar {

    private final BeerRepo repo;

    public DrommenBarService(BeerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Beer> getBeers() {

        return repo.getBeers().stream()
                .map(this::setCustomerPrice)
                .sorted(Comparator.comparing(Beer::getYpk).reversed())
                .collect(Collectors.toList());
    }

    private Beer setCustomerPrice(Beer beer) {
        beer.setCustomerPrice(beer.getGrossPrice() * 5);
        return beer;
    }
}
