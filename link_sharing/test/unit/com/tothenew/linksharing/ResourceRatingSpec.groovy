package com.tothenew.linksharing

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(ResourceRating)
class ResourceRatingSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test Resource Rating"() {

        setup:
        User user = new User(firstName: "deepak", lastName: "uniyal", emailId: "a@b.com", password: "qwerty")

        ResourceRating resource_rating = new ResourceRating(score: score,user:user)
        when:
        println(resource_rating.properties)
        Boolean result = resource_rating.validate()
        println(" validate"+resource_rating.validate())
        then:
        result == valid
        where:
        score | valid
        4     | true
        10    | false
        1     | true
        5     | true
        null  | false
        ""    | false

    }

}
