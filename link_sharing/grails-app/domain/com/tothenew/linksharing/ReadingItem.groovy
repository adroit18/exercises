package com.tothenew.linksharing

class ReadingItem {

    Resource resource;
    User user;
    boolean isRead;
    Date lastUpdated;
    Date dateCreated;
 static  belongsTo = [user:User,resource:Resource]

        static constraints = {
           // resource(nullable: false)
            resource unique: "user";
            //isRead(nullable: false)
        }

}