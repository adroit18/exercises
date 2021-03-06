package com.tothenew.linksharing

//import Link_Visibility

class TopicController {

    def index() {}

//ResourcesSearchCo co,

    def show(ResourcesSearchCo co) {
        Topic topic = Topic.read(co.topic_id);
        if (!topic) {
            flash.error = "Topic not found";
           // println("a gya gay gayg a")
            //  forward(controller: "user", action: "index");
        }
        else if (topic && topic.visibility == Link_Visibility.PUBLIC) {
            //println "asdf,nfd";
            render "Success"
        }
        else if (topic && topic.visibility == Link_Visibility.PRIVATE) {
            if (topic.subscriptions.user.findAll { it.username == session.user }) {
                render "Success";
            } else {
                flash.error = "User Subscription not found"
                redirect(controller: "login", action: "index")
            }
        }
    }

    def save(String name, String visibility) {
        Topic topic
        if(name && visibility) {
         User createdBy = session.user;
         topic = new Topic(name: name, createdBy: createdBy, visibility: Link_Visibility.toenum(visibility))
         if (topic.save()) {
             flash.message = "Topic saved Successfully"

         } else
             flash.message = "Topic could not be saved"

         }
        else
        flash.message="none"

        //render flash.message
        //render  view:"../index";
         render(view: 'create', model: [topic: topic])
      //  <g:renderErrors bean="${topic}"/>
    }



}
