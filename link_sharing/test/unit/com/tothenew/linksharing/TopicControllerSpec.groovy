package com.tothenew.linksharing

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(TopicController)
@Mock([Topic])
class TopicControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "show public topic"() {
        given:
        Topic.metaClass.'static'.read = { def id ->
            return new Topic()
        }

        when:
        controller.show(co)

        then:
       response.contentAsString=="Success"
        where:
        co << new ResourcesSearchCo(topic_id: 1, visibility: "PUBLIC")

    }

    void "show not topic subscribed"() {
        given:
        Topic topic = new Topic(visibility: Link_Visibility.PRIVATE)
        Topic.metaClass.'static'.read = { def id ->
            return topic
        }

        and:
        session.user = new User()

        and:
        User.metaClass.subscriptions = {
            null
        }
        when:
        controller.show(co)

        then:
        //response.redirectedUrl == '/login/index'
        flash.error == "Topic not found"

        where:
        co << new ResourcesSearchCo(topic_id: 1, visibility: "PUBLIC")

    }

    void "topic does not exist"() {
        given:
        Topic.metaClass.static.read = { def id ->
            return null
        }

        when:
        controller.show(co)

        then:
        //response.redirectedUrl == '/login/index'
        flash.error == 'Topic not found'

        where:
        co << new ResourcesSearchCo(topic_id: 1, visibility: "PUBLIC")

    }
}