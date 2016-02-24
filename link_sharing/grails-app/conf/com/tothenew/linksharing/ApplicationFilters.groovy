package com.tothenew.linksharing

class ApplicationFilters {

    def filters = {


        loginCheck(controller: '*',action:"*",controllerExclude:"login") {
            before = {
               if (!session.user) {
                    flash.error="Please Sign in........."
                    redirect(action: 'index', controller: 'login')
                } else {
                   if(controllerName.equals('user')  && actionName.equals('index')) {
                       println "sdfas";
                       render session.user.username;
                   }
               }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
