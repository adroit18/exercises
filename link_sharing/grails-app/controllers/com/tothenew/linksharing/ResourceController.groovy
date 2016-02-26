package com.tothenew.linksharing

class ResourceController {

    def index() {}

    def delete(Integer id) {

        Resource resource = Resource.get(id);
        if (resource.delete(flush: true))
            render "Resource Deleted"
        else
            render "Resource not found"

    }

    def search(ResourcesSearchCo co) {
        List<Resource> list = Resource.search(co).list();
        render list.description;

    }

    def show() {
        Resource resource = Resource.get(1)
        RatingInfoVO ratingInfoVO = resource.getratingInfo()
        render "${ratingInfoVO}"

        Topic topic=new Topic();
        render topic.getTrendingTopics();
    }

}


