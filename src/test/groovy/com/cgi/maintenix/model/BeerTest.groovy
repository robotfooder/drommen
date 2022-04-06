package com.cgi.maintenix.model

import spock.lang.Specification

class BeerTest extends Specification {

    def 'test the Yrsel per krona'() {
        given:
        Beer beer = Beer.builder()
                .sizeCL(40)
                .alcohol(5.7)
                .grossPrice(25)
                .build();
        when:
        def ypk = beer.getYPK()
        then:
        ypk == 9.12F
    }
}
