package com.tothenew.linksharing

import com.tothenew.linksharing.Link_Visibility

class Topic {
    String name;
    User createdBy;
    Link_Visibility visibility;
    Date lastUpdated;
    Date dateCreated;
    //static belongsTo = [user: User]
    static hasMany = [subscriptions: Subscription,  resources:Resource]
    static constraints = {
        name(blank: false, unique: 'createdBy');
        visibility(inlist: Link_Visibility.values() as List);
    }
    static mapping = {
        sort name:'asc'
    }

    def afterInsert() {
        Topic.withNewSession {
            Subscription subscription = new Subscription(topic: this ,user:this.createdBy, seriousness:Seriousness.VERY_SERIOUS)
            subscription.save()
        }
    }




}