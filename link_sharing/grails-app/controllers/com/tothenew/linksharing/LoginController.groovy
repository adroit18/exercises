package com.tothenew.linksharing

class LoginController {


    def index() {
        if (session.user) {
            List userDetails=User.userTotalSubscriptionsAndTopics(session.user)
            List subscriptionList = Subscription.getSubscribedTopics(session.user)
            List trendingTopicsList=Topic.getTrendingTopics();
            List recentShares=LinkResource.recentShares()

            flash.message="Login Successfull"
            render view: '/user/userIndex', model: [subscriptionList: subscriptionList,userDetails:userDetails,trendingTopicsList:trendingTopicsList,recentShares:recentShares]

        } else {
            List<Long> resourceIds = ResourceRating.getTopPosts().collect { it[2] };
            List<Resource> resourceList = Resource.getAll(resourceIds)

            flash.message="Login Unsuccessfull"
            render view: 'index', model: [resourceList: resourceList]
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
              //  session.user = user;
                // render flash.error
               // forward(controller: 'login', action: 'index');
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
