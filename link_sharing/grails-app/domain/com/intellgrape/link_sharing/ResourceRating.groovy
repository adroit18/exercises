package com.intellgrape.link_sharing

class ResourceRating {

    Resource resource;
    int score;
    User user;
    Date lastUpdated;
    Date dateCreated;
    static belongsTo = [user:User, resource:Resource]
    static constraints = {
        score(min: 1, max: 5)
        user(unique: 'resource')
  //      user(nullable: true)
//not a constraint given
       resource(nullable: true)
    }
}