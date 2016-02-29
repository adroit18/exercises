
<div class="panel panel-default ">

    <div class="panel-heading" class="head" id="login" >Login</div>
    <div class="panel-body bdy" margin="10px 10px 10px 10px">

        <g:form controller="login" action="index" role="form" class="form-horizontal">
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


