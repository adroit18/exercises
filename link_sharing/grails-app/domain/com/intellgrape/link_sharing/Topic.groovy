package com.intellgrape.link_sharing

import spock.util.mop.Use

class Topic {
    String name;
    User createdBy;
    Link_Visibility visibility;
    Date lastUpdated;
    Date dateCreated;
    //static belongsTo = [user: User]
    static hasMany = [subscriptions: Subscription, linkResources: LinkResource, documentResource: DocumentResource]
    static constraints = {

        name(blank: false, unique: 'createdBy');
        visibility(inlist: Link_Visibility.values() as List);


    }
}