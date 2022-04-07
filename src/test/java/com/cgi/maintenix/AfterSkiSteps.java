package com.cgi.maintenix;

import com.cgi.maintenix.model.Beer;
import com.cgi.maintenix.repository.InMemoryBeerRepo;
import com.cgi.maintenix.service.Bar;
import com.cgi.maintenix.service.DrommenBarService;
import io.cucumber.core.exception.CucumberException;
import io.cucumber.java8.En;

import java.util.List;

import static org.junit.Assert.*;

public class AfterSkiSteps implements En {
    private List<Beer> beers;
    private Bar bar;

    public AfterSkiSteps() {
        Given("^I go to the best bar in Bydalen$", () -> {
            throw new CucumberException("Not implemented");
        });
        When("^I ask to see a list of all the beers$", () -> {
        });
        Then("^all the beers in the bar is presented\\. I expect the best bar in Bydalen to have at least (\\d+) different beers$", (Integer expectedNoOfBeers) -> {

        });
        Given("^I find a beer I like in the beer list$", () -> {
        });
        When("^I order the beer from the the bartender$", () -> {
        });
        Then("^I should get the beer I asked for$", () -> {
        });



    }
}
