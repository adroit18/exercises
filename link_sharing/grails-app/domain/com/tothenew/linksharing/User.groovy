package com.tothenew.linksharing


class User {

    String emailId;
    String firstName;
    String lastName;
     String username;
    String password;
    Boolean isActive;
    Boolean isAdmin;
    byte[] profilePic;
    static transients = ['name']
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

  //  String getconfirmPassword() {
    //   return this.password;
 //}

}