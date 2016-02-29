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

<g:render template="/user/details"/>
<g:render template="/subscription/subscriptions"/>
</div>
<div class="col-xs-7">
<g:render template="/topic/trendingTopics"/>
<g:render template="/resource/recentShares"/>
</div>

</body>
</html>