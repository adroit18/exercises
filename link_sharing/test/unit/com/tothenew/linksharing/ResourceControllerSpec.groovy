package com.tothenew.linksharing

import grails.rest.Link
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.IgnoreRest
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */

@Mock([LinkResource, Resource])
@TestFor(ResourceController)
class ResourceControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @IgnoreRest
    void "testing delete of link resource"() {
        setup:
        LinkResource linkResource = new LinkResource(url: 'mylink.com').save(flush: true, validate: false)
        assert LinkResource.count()

       when:
        controller.deleteResource(linkResource.id)

        then:
        LinkResource.count() == 0
        //response.contentAsString=="Resource Deleted"
    }


/*
    void "delete tested"() {
        given:
        LinkResource linkResource = new LinkResource(url: "www.google.com")
        Resource.metaClass.static.get = { def id ->
            return linkResource
        }

        and:
        linkResource.metaClass.delete = { def id ->
            return true
        }

        when:
        controller.deleteResource(id1)

        then:
        response.contentAsString == result

        where:
        id1 | result
        1   | "Resource Deleted"
        2   | 'Resource not found'


    }

*/


}