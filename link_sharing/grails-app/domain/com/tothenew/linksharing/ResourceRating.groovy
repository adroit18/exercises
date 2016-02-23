package com.tothenew.linksharing

class ResourceRating {

    Resource resource;
    int score;
    User user;
    Date lastUpdated;
    Date dateCreated;
    static belongsTo = [user:User, resource:Resource]
    static constraints = {
        //user(nullable: false)
        //resource(nullable: false)
        score(max: 5,min: 1)
        user(unique: 'resource')

    }
}