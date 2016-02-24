package com.tothenew.linksharing

class TopicController {

    def index() {}

    def show(Integer id) {
        Topic topic = Topic.read(id);
        if (!topic) {
            flash.error = "Topic not found";
            //  forward(controller: "user", action: "index");
        } else if (topic && topic.visibility == Link_Visibility.PUBLIC) {
            render "success"
        } else if (topic && topic.visibility == Link_Visibility.PRIVATE) {
            if (topic.subscriptions.user.findAll { it.username == session.user }) {
                render "Success";
            } else {
                flash.error = "User Subscription not found"
                redirect(controller: "login", action: "index")
            }
        }
    }

    def saveTopic(String name, String visibility) {
        User createdBy = session.user;
        Topic topic = new Topic(name: name, createdBy: createdBy, visibility: Link_Visibility.toenum(visibility))
        if (topic.save())
            flash.message = "Topic saved Successfully"
        else
            flash.message = "Topic could not be saved "

        render flash.message;


    }



}
