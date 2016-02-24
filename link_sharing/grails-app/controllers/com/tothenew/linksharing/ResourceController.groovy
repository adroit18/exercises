package com.tothenew.linksharing

class ResourceController {

    def index() {}

    def delete(Integer id){

        Resource resource=Resource.get(id);
        if(resource.delete(flush:true))
        render "Resource Deleted"
        else
        render "Resource not found"

    }
}
