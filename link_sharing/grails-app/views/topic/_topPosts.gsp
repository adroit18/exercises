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

<g:each in="${resourceList}" var="resource">
<div class="panel-body bdy" margin="10px 10px 10px 10px">
    <div class="row">
        <div class="col-xs-2">
            <div class="glyphicon glyphicon-user"></div>
        </div>

        <div class="col-xs-10">
            <div>${resource.createdBy}<span class="text-muted">@uday 21 july 2014</span>

                <div class="pull-right"><a href="https://${resource.url}">${resource.url}</a></div>

                <p>
                    ${resource.description}
                </p>

                <i class="fa fa-facebook-official"></i>
                <i class="fa fa-tumblr"></i>
                <i class="fa fa-google-plus"></i>
            </div>
        </div>

    </div>
</div></br><hr style="border-width:3px;padding:0px;border-color:blue">
</g:each>
</div>

