package com.intellgrape.link_sharing

class DocumentResource extends Resource {

    String filePath;
    static constraints = {

        filePath(blank:false)
    }
}