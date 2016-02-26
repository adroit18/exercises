package com.tothenew.linksharing

class UserController {

    def index() {
        //render 'User dashboard'
 render    view:"../index"
    }

    def register() {
        User user = new User(emailId: params.email, username: params.username, password: params.password, confirmPassword: params.confirmPassword, firstName: params.firstName, lastName: params.lastName, isActive: params.isActive, isAdmin: params.isAdmin)
        if (user.save()) {
            flash.message = "User is Set Successfully !!!!!"
            // flash.message = "User is Set with emailid = ${user.emailId}, username= ${user.username},firstname=  ${user.firstName},lastname=  ${user.lastName},password= ${user.password} and confirm password= ${user.confirmPassword}";
        } else {
            flash.message = "User is not set yet !!!!!"
        }
        render flash.message;

    }


    def executeUpdate(long id,boolean isRead) {
        ReadingItem readingItem = ReadingItem.get(id)
       if (readingItem.executeUpdate("update ReadingItem as RI set RI.isRead=:isRead where RI.id=:id", [isRead:isRead, id: id]))
            {  render "Success"
                render "After updation ${readingItem.isRead}"
            }
            else
                render "Error"


    }





}