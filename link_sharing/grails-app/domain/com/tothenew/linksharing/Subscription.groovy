package com.tothenew.linksharing

class Subscription {
    Topic topic;
    User user;
    Date dateCreated;
    Date lastUpdated;
    Seriousness seriousness;
    static belongsTo = [user: User, topic: Topic]

    static constraints = {
        seriousness(nullable: false, blank: false,defaultValue:Seriousness.SERIOUS)
        user(nullable: true)        // , unique: 'topic'
    }

    static mapping = {
        topic lazy:false
        user lazy: false
    }
}