package com.tothenew.linksharing

class UserController {

    def index() {
         render "  user dashboard"
        return
    }
    def register(String emailId,String firstName,String lastName,String username,String password,Boolean isActive,Boolean isAdmin){
        User user =new User(emailId: emailId,firstName: firstName,lastName:lastName,username: username,password: password,isActive: isActive,isAdmin: isAdmin)
        if(user.save()) {
            flash.message = "User is Set with emailid = ${user.emailId}, username= ${user.username},firstname=  ${user.firstName},lastname=  ${user.lastName},password= ${user.password} and confirm password= ${user.confirmPassword}";
        }
        else {
            flash.message="User is not set yet !!!!!"
        }
        render flash.message;

    }
}
