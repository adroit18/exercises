package com.tothenew.linksharing
//import enums.Seriousness
class Subscription {
    Topic topic;
    User user;
    Date dateCreated;
    Date lastUpdated;
    Seriousness seriousness;
    static belongsTo = [user: User, topic: Topic]
    static constraints = {
        seriousness(nullable: false, blank: false)
        user(nullable: true, unique: 'topic');
    }
}