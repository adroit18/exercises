package com.tothenew.linksharing

import com.tothenew.linksharing.*

class SubscriptionController {

    def index() {}

    def saveTopic(long id) {
        Topic topic=Topic.get(id);
        User user = session.user;
        Subscription subscription=new Subscription(topic: topic,user:user,seriousness: Seriousness.SERIOUS);
        if (subscription.save(flush:true))
            flash.message = "Subscription saved Successfully"
        else
            flash.message = "Subscription could not be saved "

        render flash.message;


    }

    def update(long id,String seriousness){
        Subscription subscription=Subscription.get(id)
        if(subscription && Seriousness.toenum(seriousness)){
            subscription.seriousness=Seriousness.toenum(seriousness)
            if(subscription.save(flush: true)){
                render 'success'
            }else{
                render 'errors'
            }
        }else{
            render 'subscription or seriousness not found'
        }
    }

    def delete(long id){
        Subscription subscription=Subscription.get(id);
        if(subscription) {
            subscription.delete(flush:true)
            flash.message="Subscription Deleted Successfully"
        }
        else
            flash.message="Subscription Not Found";

        render flash.message;
    }



}
