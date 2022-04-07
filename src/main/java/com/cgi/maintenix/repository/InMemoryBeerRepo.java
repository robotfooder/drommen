package com.cgi.maintenix.repository;

import com.cgi.maintenix.model.Beer;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

import static com.cgi.maintenix.model.BeerBrand.*;
import static com.cgi.maintenix.model.BeerType.*;

@Singleton
public class InMemoryBeerRepo implements BeerRepo {

    private final List<Beer> beersInStore = new ArrayList<>();

    public InMemoryBeerRepo() {
        beersInStore.add(Beer.builder()
                .brand(REINKLOU)
                .name("No. 3")
                .type(PILSNER)
                .alcohol(4.8F)
                .grossPrice(20.30F)
                .quantity(3)
                .build());
        beersInStore.add(Beer.builder()
                .brand(REINKLOU)
                .name("No. 2")
                .type(IPA)
                .alcohol(6.5F)
                .grossPrice(29.80F)
                .quantity(2)
                .build());
        beersInStore.add(Beer.builder()
                .brand(JAMTLAND)
                .name("Fenix")
                .type(BITTER)
                .alcohol(5.0F)
                .grossPrice(21.50F)
                .quantity(6)
                .build());
        beersInStore.add(Beer.builder()
                .brand(JAMTLAND)
                .name("Mango IPA")
                .type(IPA)
                .alcohol(5.4F)
                .grossPrice(26.50F)
                .quantity(1)
                .build());
        beersInStore.add(Beer.builder()
                .brand(CARLSBERG)
                .name("Export")
                .type(LAGER)
                .alcohol(5.0F)
                .grossPrice(11.90F)
                .quantity(300)
                .build());
        beersInStore.add(Beer.builder()
                .brand(CARLSBERG)
                .name("Sort Guld")
                .type(LAGER)
                .alcohol(5.5F)
                .grossPrice(15.90F)
                .sizeCL(50)
                .quantity(67)
                .build());
        beersInStore.add(Beer.builder()
                .brand(STIEGL)
                .name("Goldbrau")
                .type(LAGER)
                .alcohol(5.0F)
                .grossPrice(23.90F)
                .sizeCL(50)
                .quantity(34)
                .build());
        beersInStore.add(Beer.builder()
                .brand(MODELO)
                .name("Corona Extra")
                .type(LAGER)
                .alcohol(4.5F)
                .grossPrice(18.90F)
                .sizeCL(35)
                .quantity(23)
                .build());
        beersInStore.add(Beer.builder()
                .brand(MODELO)
                .name("Corona Cero")
                .type(LAGER)
                .alcohol(0.0F)
                .grossPrice(12.90F)
                .quantity(23)
                .build());
        beersInStore.add(Beer.builder()
                .brand(ARBOGA)
                .name("Arboga Originalet")
                .type(LAGER)
                .alcohol(5.6F)
                .grossPrice(10.90F)
                .quantity(99)
                .build());
        beersInStore.add(Beer.builder()
                .brand(KRONENBOURG)
                .name("1664")
                .type(LAGER)
                .alcohol(5.0F)
                .grossPrice(14.30F)
                .quantity(5)
                .build());
        beersInStore.add(Beer.builder()
                .brand(KRONENBOURG)
                .name("Grimbergen Blonde")
                .type(ALE)
                .alcohol(6.7F)
                .grossPrice(19.90F)
                .quantity(12)
                .build());
        beersInStore.add(Beer.builder()
                .brand(ARBOGA)
                .name("Arboga 10,2")
                .type(LAGER)
                .alcohol(10.2F)
                .grossPrice(20.90F)
                .sizeCL(50)
                .quantity(10)
                .build());

    }

    @Override
    public List<Beer> getBeers() {
        return this.beersInStore;
    }
}
