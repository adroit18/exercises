package com.tothenew.linksharing

class ResourceController {

    def index() {}

    def delete(){
        Resource resource=Resource.load(params.id)
        if(resource){
            resource.delete(flush: true)
        }
        else{
            render 'resource not found'
        }
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


