<%--
  Created by IntelliJ IDEA.
  User: deepak
  Date: 27/2/16
  Time: 11:29 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Link Sharing</title>
</head>

<body>
<div class="col-xs-5">
%{--<g:each in="${userDetails}" var="details">--}%
    %{--sadfasdfadfadfadfafafass ${details[0]}</g:each>--}%
<g:render template="/user/details" model="[userDetails:userDetails]" />
<g:render template="/subscription/subscriptions" model="[subscriptionList:subscriptionList]" />
</div>
<div class="col-xs-7">
<g:render template="/topic/trendingTopics" model="[trendingTopicsList:trendingTopicsList]"/>
<g:render template="/resource/recentShares" model="[recentShares:recentShares]"/>
</div>

</body>
</html>