package com.intellgrape.link_sharing

//import enums.Seriousness
import grails.plugin.cache.SerializableOutputStream

class Subscription {
    Topic topic;
    User user;
    Date dateCreated;
    Date lastUpdated;
    Seriousness seriousness;
    static belongsTo = [user:User,topic:Topic]
    static constraints = {
        seriousness(nullable: false,blank:false)
        user(nullable:true)
        topic(nullable:true)

        user(unique:'topic');
    }
}