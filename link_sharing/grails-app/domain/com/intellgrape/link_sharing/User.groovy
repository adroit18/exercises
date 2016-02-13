package com.intellgrape.link_sharing


class User {

    String emailId;
    String firstName;
    String lastName;
   // String name;
    String password;
    Boolean isActive;
    Boolean isAdmin;
    byte[] profilePic;
    static transients = ['name']
    Date lastUpdated;
    Date dateCreated;


    static hasMany = [topics: Topic, subscriptions: Subscription,readingItems:ReadingItem, linkResources: LinkResource, documentResource: DocumentResource, ratingItem: ResourceRating]
    static mapping = {

        profilePic(sqlType: 'longblob')
    }


    static constraints = {
        emailId(unique: true, blank: false, email: true);
        password(blank: false, minSize: 5);
        firstName(blank: false);
        lastName(blank: false);
       // isActive nullable : true
        isActive(nullable: true);
        isAdmin(nullable: true);
        profilePic(nullable: true);
    }

    String getName() {
        [this.firstName, this.lastName].findAll{it}.join(' ')

    }
}