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
        <title>Welcome HOD</title>
        <link rel="shortcut icon" href="logo.png" type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <style type="text/css">
            html,body,#main-content{
                height: 100%;
            }
        </style>
    </head>
    <body>

        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <!-- Div for Brand Name -->
                <div class="navbar-header">
                    <a href="/PRP_TS/" class="navbar-brand" style="color:black;">
                        <span class="glyphicon glyphicon-ok" style="border: 1px solid black"></span>
                        &nbsp;MarkGen
                    </a>
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#nav1">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                
                <div class="collapse navbar-collapse" id="nav1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown" >
                            <a title="" class="dropdown-toggle btn" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-user"></span>
                                &nbsp;
                                Profile
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a title="" disabled="true">
                                        <span class="glyphicon glyphicon-info-sign"></span>
                                    &nbsp;Signed in as HOD
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-wrench"></span>
                                        &nbsp;Change password
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-log-out"></span>
                                        &nbsp;Logout
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a title="" class="" >
                                <span>
                                    <img src="viewmarks.png" alt="category" style="height: 20px;">
                                </span>
                                &nbsp;
                                View Marks
                                &nbsp;
                            </a>
                            
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a title="" class="dropdown-toggle btn" data-toggle="dropdown">
                                <span>
                                    <img src="advisor.png" alt="category" style="height: 20px;">
                                </span>
                                &nbsp;
                                Advisors
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-plus"></span>
                                        &nbsp;Add Advisor
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-retweet"></span>
                                        &nbsp;Update Advisor
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-trash"></span>
                                        &nbsp;Remove Advisor
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a title="" class="" >
                                <span>
                                    <img src="analysis.png" alt="category" style="height: 20px;">
                                </span>
                                &nbsp;
                                Analysis
                                &nbsp;
                            </a>
                            
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a title="" class="dropdown-toggle btn" data-toggle="dropdown">
                                <span>
                                    <img src="class.png" alt="venue" style="height: 20px;">
                                </span>
                                &nbsp;
                                Class
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="addVenue.jsp" title="">
                                        <span class="glyphicon glyphicon-plus"></span>
                                        &nbsp;Add Class
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-wrench"></span>
                                        &nbsp;Update Class
                                    </a>
                                </li>
                                <li>
                                    <a href="" title="">
                                        <span class="glyphicon glyphicon-trash"></span>
                                        &nbsp;Remove Class
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>            
                </div>
            </div>
        </nav>
        
        <!-- Main Content -->
        <div class="container-fluid bg-primary" style="padding-top: 70px;padding-bottom: 70px;" id="main-content">
            <div class="row" style="height: 100%;">
                <form action="MainServlet" method="post" class="col-xs-6 col-xs-offset-3 form-horizontal text-center">
                    <div class="form-group">
                        <label for="venueName" class="control-label col-xs-3">Venue Name</label>
                        <div class="col-xs-9">
                            <input type="text" id="venueName" name="venueName" class="form-control">
                        </div> 
                    </div>
                    <input type="hidden" name="action" value="addVenue">
                    <input type="submit" class="btn btn-default btn-primary" value="Add">
                </form>
                ${venueName}
                ${venueStatus}
            </div>
        </div>
        

        <!-- Footer Navbar -->
        <nav class="navbar navbar-default navbar-fixed-bottom">
            <div class="container-fluid">
                <div class="navbar-header navbar-right">
                    
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="aboutUs.html" title="" class="btn">About us</a>
                    </li>
                    <li>
                        <a href="contactUs.html" title="" class="btn">Contact us</a>
                    </li>
                </ul> 
            </div>
        </nav>       
    </body>
</html>
