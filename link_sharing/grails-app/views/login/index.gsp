<%@
page import="com.tothenew.linksharing.*" %>

<html>
<head>
    <title>

    </title>
    <meta name="layout" content="main"/>

    <style>
    .top {
        border: solid black;
        border-radius: 8px;
    }

    a {
        text-decoration: underline;
    }

    #search-panel {
        border: solid black;
        border-radius: 8px;
    }

    .head {
        border: solid black;
        border-bottom: none;
        border-top-left-radius: 8px;
        border-top-right-radius: 8px;
    }

    .bdy {
        border: solid black;
        border-bottom-left-radius: 8px;
        border-bottom-right-radius: 8px
    }

    .glyphicon-user {
        font-size: 60px;
        border: solid black;
    }
    </style>

</head>

<body>
<div class="container">
    <div class="col-xs-7">
        <div class="panel panel-default ">
            <div class="head panel-heading" id="recentShares">Recent Shares</div>

            <div class="panel-body bdy" margin="10px 10px 10px 10px">
                <div class="row">
                    <div class="col-xs-2">
                        <div class="glyphicon glyphicon-user"></div>
                    </div>

                    <div class="col-xs-10">
                        <div>Uday Pratap Singh<span class="text-muted">@uday 5min</span>

                            <div class="pull-right"><a href="#">Grails</a></div>

                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut</p>
                            <i class="fa fa-facebook-official"></i>
                            <i class="fa fa-tumblr"></i>
                            <i class="fa fa-google-plus"></i>
                        </div>
                    </div>
                </div>
                <br/>

                <div class="row">
                    <div class="col-xs-2">
                        <div class="glyphicon glyphicon-user"></div>
                    </div>

                    <div class="col-xs-10">
                        <div>Uday Pratap Singh<span class="text-muted">@uday 10min</span>

                            <div class="pull-right"><a href="#">Grails</a></div>

                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut</p>
                            <i class="fa fa-facebook-official"></i>
                            <i class="fa fa-tumblr"></i>
                            <i class="fa fa-google-plus"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="panel panel-default " >
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

            <div class="panel-body bdy" margin="10px 10px 10px 10px">
                <div class="row">
                    <div class="col-xs-2">
                        <div class="glyphicon glyphicon-user"></div>
                    </div>

                    <div class="col-xs-10">
                        <div>Uday Pratap Singh<span class="text-muted">@uday 21 july 2014</span>

                            <div class="pull-right"><a href="#">Grails</a></div>

                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut</p>
                            <i class="fa fa-facebook-official"></i>
                            <i class="fa fa-tumblr"></i>
                            <i class="fa fa-google-plus"></i>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>

    <div class="col-xs-5">
        <div class="panel panel-default ">

            <div class="panel-heading" class="head" id="login">Login</div>
            <div class="panel-body bdy" margin="10px 10px 10px 10px">

                <g:form controller="login" action="login" role="form" class="form-horizontal">
                    <div class="form-group">
                        <div class="col-xs-4"><label class="control-label">Email/Username<sup>*</sup></label></div>

                        <div class="col-xs-8"><input type="text" class="form-control" name="username"/></div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-4"><label class="control-label">Password<sup>*</sup></label></div>

                        <div class="col-xs-8"><input type="password" class="form-control" name="password"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-2"></div>

                        <div class="col-xs-5">
                            <a href="#">Forgot Password</a>
                        </div>

                        <div class="col-xs-5">
                            <g:actionSubmit value="login" class="btn btn-default active" style="width:100%"/>
                        </div>
                    </div>
                </g:form>
            </div>
        </div>

        <div class="panel panel-default ">
            <div class="panel-heading" id="head">Register</div>

            <div class="panel-body bdy" margin="10px 10px 10px 10px">
                <form role="form" class="form-horizontal">
                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">First Name<sup>*</sup></label></div>

                        <div class="col-xs-7"><input type="text" class="form-control"/></div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Last Name<sup>*</sup></label></div>

                        <div class="col-xs-7"><input type="text" class="form-control"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Email<sup>*</sup></label></div>

                        <div class="col-xs-7 "><input type="text" class="form-control"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Username Name<sup>*</sup></label></div>

                        <div class="col-xs-7 "><input type="text" class="form-control"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Password<sup>*</sup></label></div>

                        <div class="col-xs-7"><input type="password" class="form-control"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Confirm Password<sup>*</sup></label></div>

                        <div class="col-xs-7 "><input type="password" class="form-control"/></div>

                    </div>

                    <div class="form-group">
                        <div class="col-xs-5"><label class="control-label">Photo<sup>*</sup></label></div>

                        <div class="col-xs-4 "><input type="text" class="form-control"/></div>

                        <div class="col-xs-3">
                            <button type="submit" class="btn btn-default active">Browse</button>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-8"></div>

                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-default active" style="width:100%">Login</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>