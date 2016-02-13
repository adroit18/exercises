package com.intellgrape.link_sharing

abstract class Resource {
    String description;
    User createdBy;
    Topic topic;
    Date lastUpdated;
    Date dateCreated;
    static hasMany = [readingItem:ReadingItem,resourceRating:ResourceRating]
 static belongsTo = [topic:Topic]
    static mapping = {
        //tablePerHierarchy( false)
        description(type:'text')
    }

    static constraints = {
    }
}