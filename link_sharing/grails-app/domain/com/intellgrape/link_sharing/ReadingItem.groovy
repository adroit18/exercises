package com.intellgrape.link_sharing

class ReadingItem {

    Resource resource;
    User user;
    boolean isRead;
    Date lastUpdated;
    Date dateCreated;
 static  belongsTo = [user:User,resource:Resource]
    static constraints = {
        isRead(nullable:false,defaultValue:false)
        resource(nullable: true)
        user(nullable: true)
    }
}