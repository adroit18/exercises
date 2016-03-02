<%@ page import="com.tothenew.linksharing.*" %>
%{--//trending topics--}%
<div class="panel panel-default" style="border:3px solid blueviolet;border-radius:8px">
    <div class="panel-heading" style="border-bottom:3px solid blueviolet;">Trending Topics
        <div class="pull-right">
            <a href="#" style="text-decoration:underline">View ALL</a></div></div>

<g:each in="${trendingTopicsList}" var="trending">


    <div class="panel-body">

        <div class="col-xs-2">
            <span class="glyphicon glyphicon-user" style="font-size:60px;border:solid black;"></span>
        </div>

        <div class="col-xs-10 pull-left"><a href="#" class="col-xs-8" style="text:decoration:underline">${trending.name}</a></br></br>
            <span class="col-xs-4 text-muted"> @${trending.createdBy}</span>
              <span class="col-xs-4" style="padding-left:1px">Subscriptions</span>
            <span class="col-xs-4" style="padding-left:1px">Topics</span><br>
            <span class="col-xs-4" style="color:blue;"><a href="#" style="text-decoration:underline">Unsubscribe</a></span>
            <span class="col-xs-4" style="color:blue;padding-left:1px">${trending.count}</span>
            <span class="col-xs-4" style="color:blue;padding-left:1px"> 50</span>

        </div>
        <br><br><br><br>
        <hr style="border-width:3px;padding:0px;border-color:blue">

    </div>
</g:each>
</div>