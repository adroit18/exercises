package com.tothenew.linksharing

abstract class Resource {
    String description;
    User createdBy;
    Topic topic;
    Date lastUpdated;
    Date dateCreated;

    static hasMany = [readingItems: ReadingItem, resourceRating: ResourceRating]
        static belongsTo = [topic: Topic]
    static transients = ['ratingInfo'];

    static mapping = {
        tablePerHierarchy(false)
        description(type: 'text')
    }

    static constraints = {
    }

    static namedQueries = {
        search { ResourcesSearchCo co ->
            if (co.topic_id) {
                eq('topic_id', co.topic_id)
            }
            if (co.visibility) {
                like('visibility', co.visibility)
            }
        }
    }

 static RatingInfoVO getratingInfo() {
        List result = ResourceRating.createCriteria().get {
            projections {
                count('id', 'totalVotes')
                sum('score')
                avg('score')
            }
            eq('user', this)
            order('totalVotes', 'desc')
        }

        new RatingInfoVO(totalVotes: result[0], totalScore: result[1], averageScore: result[2])
    }


static List recentShares() {
    List recentShares = Resource.createCriteria().list(max:5,offset:0,sort:'lastUpdated',order:'desc') {
        projections {
            property('url')
            property('description')
            property('filePath')
            property('createdBy')
            property('topic')
            //count();
            property('lastUpdated')

        }

    }
    return recentShares

}

}
