
 <div class="panel panel-default" style="border:3px solid blueviolet;border-radius:8px">
            <div class="panel-heading" style="border-bottom:3px solid blueviolet;">Recent Shares</div>

<g:each in="${recentShares}" var="shares">
            <div class="panel-body">

            <div class="col-xs-2">
            	<span class="glyphicon glyphicon-user" style="font-size:60px;border:solid black;"></span>
            </div>
            <div class="col-xs-10">${shares[3]}<span class="text-muted"> @${new Date()-shares[5]}</span><span class="pull-right"><a href="#">${shares[0]}</a></span>
            <p>${shares[1]}</p>
        <div class="col-xs-2"><i class="fa fa-facebook-official"></i>
        <i class="fa fa-tumblr"></i>
        <i class="fa fa-google-plus"></i>  </div>
            <div class="col-xs-2"><a href="${shares[2]}" style="text-decoration:underline;font-size:10px">Download</a></div>
            <div class="col-xs-3"><a href="#" style="text-decoration:underline;font-size:10px">View full site</a></div>
            <div class="col-xs-3"><a href="#" style="text-decoration:underline;font-size:10px">Mark as Read</a></div>
            <div class="col-xs-2"><a href="#" style="text-decoration:underline;font-size:10px">View Post</a></div>

            </div>

                <div class="col-xs-12"><hr style="border-width:3px;padding:0px;border-color:blue"></div>



        </div>

</g:each>
   </div>