<%@ page import="com.tothenew.linksharing.*" %>

<div class="panel panel-default " style="border:none">
    <div class="panel-heading head" id="topPosts">
        Top Posts

        <div class="pull-right "><form>
            <select class="form-control" id="sel1" style="height:29px">
                <option>Public</option>
                <option>Private</option>
                <option>Global</option>
                <option>Mid</option>
            </select></form>
        </div>

    </div>

<% ResourceRating resourceRating = new ResourceRating()
def list = resourceRating.getTopPosts();
list.each {

%>
<div class="panel-body bdy" margin="10px 10px 10px 10px">
    <div class="row">
        <div class="col-xs-2">
            <div class="glyphicon glyphicon-user"></div>
        </div>

        <div class="col-xs-10">
            <div>Uday Pratap Singh<span class="text-muted">@uday 21 july 2014</span>

                <div class="pull-right"><a href="#">Grails</a></div>

                <p>
                    <% println "topic says  ${it[0]}, with a score of ${it[1]}" %>
                </p>

                <i class="fa fa-facebook-official"></i>
                <i class="fa fa-tumblr"></i>
                <i class="fa fa-google-plus"></i>
            </div>
        </div>

    </div>
</div></br><hr style="border-width:3px;padding:0px;border-color:blue">
<%

    }
%>
</div>

