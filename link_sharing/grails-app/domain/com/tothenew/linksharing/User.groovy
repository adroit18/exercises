package com.tothenew.linksharing

import com.tothenew.linksharing.*
class User {

    String emailId;
    String firstName;
    String lastName;
    String username;
    String password;
    Boolean isActive;
    Boolean isAdmin;
    byte[] profilePic;
    static transients = ['name','subscribedTopics']
    transient  confirmPassword;

    Date lastUpdated;
    Date dateCreated;


    static hasMany = [topics: Topic, subscriptions: Subscription, readingItems: ReadingItem, resources:Resource, ratingItems: ResourceRating]
    static mapping = {
        profilePic(sqlType: 'longblob')
        sort id:'desc'


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

        confirmPassword(bindable:true,nullable: true,blank: true, validator:{String val,User obj->
            boolean result=false

            if(obj.id){
                result=true
            }
            else{
                result=val=obj.password
            }
            return result
        })


    }

    String getName() {
        [this.firstName, this.lastName].findAll { it }.join(' ')

    }

    String toString(){
        return getName()
    }



    static List<TopicVO> getTrendingTopics() {
        List resources = Resource.createCriteria().list {
            projections {
                createAlias('topic', 't')
                groupProperty('t.id')
                property('t.name')
                property('t.visibility')
                property('createdBy')
                count();
            }
        }
        List list=resources.sort{-it[4]}
        List<TopicVO> vos = []
        list.each {
            vos << new TopicVO(id:it[0],name:it[1],visibility:it[2],createdBy:it[3],count:it[4])
        }
        return vos[0..4];
    }

    static List userTotalSubscriptionsAndTopics(User user1) {
        List userDetails1 = Subscription.createCriteria().listDistinct {
            projections {
                count()
            }
            eq("user.id", user1.id)
        }
        List userDetails2 = Topic.createCriteria().listDistinct {
            projections {
                count()
            }
            eq("createdBy", user1)
        }
       List userDetails=userDetails1+userDetails2
        println userDetails
        return userDetails;

    }






    //  String getconfirmPassword() {
    //   return this.password;
    //}

}