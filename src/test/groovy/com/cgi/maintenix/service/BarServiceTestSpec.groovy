package com.cgi.maintenix.service

import com.cgi.maintenix.model.Beer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class BarServiceTestSpec extends Specification {

    @Inject
    Bar drommenBar

    def 'Fetch all the beers from the service'() {

        when: 'list all the beers'
        List<Beer> beers = drommenBar.getBeers()
        then: 'the beer list should not be empty'
        !beers.isEmpty()
        beers.each { beer ->
            assert beer.customerPrice > beer.grossPrice
            assert beer.customerPrice > 0
            assert beer.sizeCL > 0
        }
    }
}
