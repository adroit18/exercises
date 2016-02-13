class BootStrap {
def grailsApplication
    def init = {


        //""${userHome}/.grails/${appName}-config.groovy""
      println "External file is included"+grailsApplication.config.myname
    }
    def destroy = {
    }
}
