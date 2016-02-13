package com.intellgrape.link_sharing

class LinkResource extends Resource{

    String url;
    static constraints = {
        url(url:true);
    }
}