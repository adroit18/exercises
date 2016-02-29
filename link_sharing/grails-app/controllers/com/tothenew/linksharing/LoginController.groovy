package com.tothenew.linksharing

class LoginController {

    def index() {
        if (session.user) {
            render view: '/user/userIndex'
        }
        else
        {
            render view: 'index'
        }
    }

    def login(String username, String password) {
        User user = User.findByUsernameAndPassword(username, password);

       // ResourceRating resourceRating = new ResourceRating()
       // render resourceRating.getTopPosts();
        if (user) {
            if (user.isActive == true) {
                session.user = user;
                forward(controller: 'login', action: 'index');
            } else {
                flash.message = 'your account is not active';
                session.user = user;
                // render flash.error
                 forward(action:"index")
            }
        } else {
            flash.error = 'User not found';
            render flash.error

        }
    }


    def logout() {
        session.invalidate()
        flash.error = "User logged Out"

        forward(controller: 'login', action: 'index')


    }


}
