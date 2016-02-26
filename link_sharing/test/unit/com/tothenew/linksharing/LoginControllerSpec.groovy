package com.tothenew.linksharing

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */


@TestFor(LoginController)
class LoginControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Login index forward"() {
        setup:
        session.user = new User()

        when:
        controller.index()

        then:
        response.forwardedUrl == '/user/index'
    }

    void "Login index should render failure when Session.user is not set"() {
        when:
        controller.index()

        then:
        response.contentAsString == "Failure null"
    }

    @Unroll
    void "login Handler action"() {
        setup:
        User.metaClass.static.findByUsernameAndPassword = { username1, password1 ->
            return new User(isActive: active)
        }
        // username='Deepak Uniyal'
        // password=test@1234

        when:
        controller.loginHandler(username, password)

        then:
        response.forwardedUrl == result
        flash.error == error

        where:
        active | result         | error                        | username        | password
        true   | '/login/index' | null                         | 'Deepak Uniyal' | 'test@1234'
        false  | null           | 'your account is not active' | 'Deepak Uniyal' | 'test@1234'
    }


    @Unroll
    void "login Handler should set error"() {
        setup:
        User.metaClass.static.findByUsernameAndPassword = { username1, password1 ->
            return null
        }
        when:
        controller.loginHandler(username, password)

        then:
        flash.error == error

        where:
        error            | username        | password
        'User not found' | 'Deepak Uniyal' | 'test@1234'

    }


    void "logout"() {
        setup:
        session.user = new User()

        when:
        controller.logout()

        then:
        session.user == null
        response.forwardedUrl == '/login/index'
    }

}