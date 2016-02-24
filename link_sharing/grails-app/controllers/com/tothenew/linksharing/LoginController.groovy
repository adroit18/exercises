package com.tothenew.linksharing

class LoginController {

    def index() {
        if (session.user) {
            forward(controller: 'user', action: 'index');
        } else {
            render "Failure " + flash.error
        }
    }

    def loginHandler(String username, String password) {
        User user = User.findByUsernameAndPassword(username, password);
        if (user) {

            if (user.isActive==true) {
                session.user = user;
                forward(controller: 'login', action: 'index');

            } else {
                flash.error = 'your account is not active';
                render flash.error
                // forward(action:"index")
            }
        } else {
            flash.error = 'User not found';
            render(flash.error)

        }
    }


    def logout() {
              session.invalidate()
       flash.error="User logged Out"
             forward(controller: 'login', action: 'index')


    }


}
