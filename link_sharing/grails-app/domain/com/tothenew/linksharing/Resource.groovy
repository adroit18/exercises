package com.tothenew.linksharing

abstract class Resource {
    String description;
    User createdBy;
    Topic topic;
    Date lastUpdated;
    Date dateCreated;
    static hasMany = [readingItems: ReadingItem, resourceRating: ResourceRating]
    static belongsTo = [topic: Topic]

    static mapping = {
        //tablePerHierarchy( false)
        description(type: 'text')
    }

    static constraints = {
    }
}