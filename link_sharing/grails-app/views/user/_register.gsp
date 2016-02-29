<div class="panel panel-default ">
    <div class="panel-heading" id="head">Register</div>

    <div class="panel-body bdy" margin="10px 10px 10px 10px">
        <g:form role="form" class="form-horizontal" controller="user" action="register">
            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">First Name<sup>*</sup></label></div>

                <div class="col-xs-7"><input type="text" name="firstName" class="form-control"/></div>
            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Last Name<sup>*</sup></label></div>

                <div class="col-xs-7"><input type="text" name="lastName" class="form-control"/></div>

            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Email<sup>*</sup></label></div>

                <div class="col-xs-7 "><input type="text" name="email" class="form-control"/></div>

            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Username<sup>*</sup></label></div>

                <div class="col-xs-7 "><input type="text" name="username" class="form-control"/></div>

            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Password<sup>*</sup></label></div>

                <div class="col-xs-7"><input type="password" name="password" class="form-control"/></div>

            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Confirm Password<sup>*</sup></label></div>

                <div class="col-xs-7 "><input type="password" name="confirmPassword" class="form-control"/></div>

            </div>

            <div class="form-group">
                <div class="col-xs-5"><label class="control-label">Photo<sup>*</sup></label></div>

                <div class="col-xs-4 "><input type="text" name="profilePic" class="form-control"/></div>

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
        </g:form>
    </div>
</div>
