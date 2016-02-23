package com.intellgrape.link_sharing

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
 
 //we are told not to test the uniqueness constraint yet.
/*@TestFor(Subscription)

class SubscriptionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


        def "test something"() {
            setup:
              User user = new User(firstName: "deepak", lastName: "uniyal", emailId: "a@b.com", password: "qwertsdy")
              Topic topic = new Topic(name:"grails", visibility:Link_Visibility.PRIVATE, createdBy: user)
              Subscription subscription=new Subscription(user:user,Topic:topic,seriousness:Seriousness.SERIOUS)

            when: "User will save"
                subscription.save(failOnError: true);
            then: ""
                    subscription.count()==1;
           when: ""
              //User user1 = new User(firstName: "deepak", lastName: "uniyal", emailId: "a@b.com", password: "qwertsdy")
               Topic newtopic = new Topic(name:"grails", visibility:Link_Visibility.PRIVATE, createdBy: user)
           Subscription newSubscription=new Subscription(user:user,Topic:newtopic,seriousness:Seriousness.SERIOUS)

           newSubscription.save(failOnError: true);

            then: ""
              user.count()==1;
            newSubscription.errors.allErrors.size() == 1;
            newSubscription.errors.getFieldErrorCount('user') == 1;




        }*/

    void "test for Seriousness"() {

        setup:
        Subscription subscription = new Subscription(seriousness: seriousness)
        when:
        Boolean result = subscription.validate()
        then:
        result == valid;
        where:

        seriousness              | valid
        Seriousness.SERIOUS      | true
        Seriousness.CASUAL       | true
        Seriousness.VERY_SERIOUS | true
        null                     | false
        ""                       | false

    }


}
