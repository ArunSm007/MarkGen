<%-- 
    Document   : index
    Created on : 11 Mar, 2017, 9:00:25 PM
    Author     : Arun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MarkGen</title>
        <link rel="shortcut icon" href="logo.png" type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <style>
            html,body,.container-fluid{
                height: 100%;
            }
        </style>
    </head>
    <body>

        <nav class="navbar navbar-default navbar-fixed-top" style="background: rgb(51,173,255);">
            <div class="container-fluid">
                <!-- Div for Brand Name -->
                <div class="navbar-header">
                    <a href="/PRP_TS/" class="navbar-brand" style="color:black;">
                        <span class="glyphicon glyphicon-ok" style="border: 1px solid black">
                        </span>
                        &nbsp;MarkGen
                    </a>
                </div>
            </div>
        </nav>

        <div class="container-fluid bg-default" style="">
            <div class="row" style="padding-top: 50px;height: 100%;">
                <div class="row col-xs-4 col-xs-offset-4 bg-primary" style="border-radius: 5px;margin-top: 10%;">
                    <form action="MainServlet" method="post" class="text-center form-horizontal" style="padding:10px;">
                        <div class="form-group col-xs-12">
                            <label class="control-label col-xs-3" for="userName">Username</label>
                            <span class="col-xs-9">
                            <input type="text" id="userName" name="userName" class="form-control col-xs-9" placeholder="Username">
                            </span>
                        </div>
                        <div class="form-group col-xs-12">
                            <label class="control-label col-xs-3" for="password">Password</label>
                            <span class="col-xs-9">
                            <input type="password" id="passWord" name="passWord" class="form-control" placeholder="Password">
                            </span>
                        </div>
                        <input type="hidden" value="login" name="action">
                        <input type="submit" class="btn btn-default" value="Sign in"></button>
                    </form>
                    <div class="text-danger bg-danger">
                        ${status}
                    </div>
                </div>
            </div>   
        </div>

         <!--Footer Navbar--> 
        <nav class="navbar navbar-default navbar-inverse navbar-fixed-bottom"  style="background: rgb(51,173,255);">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="aboutUs.html" title="" class="btn"  style="color: black;">About us</a>
                    </li>
                    <li>
                        <a href="contactUs.html" title="" class="btn"  style="color: black;">Contact us</a>
                    </li>
                </ul>              
            </div>
        </nav>       
    </body>
</html>
