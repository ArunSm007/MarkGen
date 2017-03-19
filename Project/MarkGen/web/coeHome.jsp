<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Welcome COE</title>
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
                            <a title="" class="dropdown-toggle" data-toggle="dropdown">
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
                                        &nbsp;Signed in as COE
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
                        <li class="dropdown">
                            <a title="" class="dropdown-toggle" data-toggle="dropdown">
                                <span>
                                    <img src="generate.png" alt="Training" style="height: 20px;">
                                </span>
                                &nbsp;
                                Internal Mark
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="generateMarks.jsp" title="">
                                        <span class="glyphicon glyphicon-plus"></span>
                                        &nbsp;Generate
                                    </a>
                                </li>
                                <li>
                                    <a href="viewMarks.jsp" title="">
                                        <span class="glyphicon glyphicon-retweet"></span>
                                        &nbsp;View Marks
                                    </a>
                            </ul>
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a title="" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-book"></span>
                                &nbsp;
                                Subjects
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="addSubject.jsp" title="">
                                        <span class="glyphicon glyphicon-plus"></span>
                                        &nbsp;Add/Update Subjects
                                    </a>
                                </li>
                                <li>
                                    <a href="removeSubject.jsp" title="">
                                        <span class="glyphicon glyphicon-trash"></span>
                                        &nbsp;Remove Subject
                                    </a>
                                </li>
                                <li>
                                    <a href="updateSubject.jsp" title="">
                                        <span class="glyphicon glyphicon-retweet"></span>
                                        &nbsp;Allocate Subjects
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a title="" href="deadline.jsp" class="" >
                                <span>
                                    <img src="deadline.png" alt="category" style="height: 20px;">
                                </span>
                                &nbsp;
                                Deadline
                                &nbsp;
                            </a>
                            
                        </li>
                    </ul>   
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a title="" class="dropdown-toggle" data-toggle="dropdown">
                                <span>
                                    <img src="student.png" alt="venue" style="height: 20px;">
                                </span>
                                &nbsp;
                                Student
                                &nbsp;
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="addStudent.jsp" title="">
                                        <span class="glyphicon glyphicon-plus"></span>
                                        &nbsp;Add/Update
                                    </a>
                                </li>
                                <li>
                                    <a href="removeStudent.jsp" title="">
                                        <span class="glyphicon glyphicon-trash"></span>
                                        &nbsp;Remove
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
                
            </div>
        </div>
        

        <!-- Footer Navbar -->
        <nav class="navbar navbar-default navbar-inverse navbar-fixed-bottom" style="background:white;">
            <div class="container-fluid">
                <div class="navbar-header navbar-right">
                    
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="aboutUs.html" title="" style="color:black">About us</a>
                    </li>
                    <li>
                        <a href="contactUs.html" title="" style="color:black">Contact us</a>
                    </li>
                </ul> 
            </div>
        </nav>       
    </body>
</html>
