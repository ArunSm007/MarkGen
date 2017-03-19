
<%@page import="com.markgen.dao.SubjectDao"%>
<%@page import="com.markgen.beans.SubjectDetails"%>
<%@page import="com.markgen.dao.StudentDao"%>
<%@page import="com.markgen.beans.StudentDetails"%>
<%@page import="java.util.List"%>
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
                color: black;
            }
        </style>
        <script type="text/javascript">
            function addRow(tableId) {
              var x=document.getElementById(tableId);
              var new_row = x.rows[x.rows.length-1].cloneNode(true);
              var len = x.rows.length;
              var inp1;
              for(var i=0;i<new_row.cells.length;i++){
                if(new_row.cells[i].getElementsByTagName('input').length>0){
                  inp1=new_row.cells[i].getElementsByTagName('input')[0];
                }
                else if(new_row.cells[i].getElementsByTagName('select').length>0){
                  inp1=new_row.cells[i].getElementsByTagName('select')[0];
                }
                inp1.setAttribute("required","true");
                inp1.removeAttribute("readonly");
                inp1.id+=len;
                inp1.name+=len;
                inp1.value='';
                inp1=null;
              }
              x.appendChild( new_row );
            }

            function deleteRow(r,tableId) {
              var x = document.getElementById(tableId);
              if(x.rows.length == 2) {
                addRow(tableId);
              }
              var i = r.parentNode.parentNode.rowIndex;
              x.deleteRow(i);
            }
        </script>
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
                                    &nbsp;Signed in as PMO
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
                                        &nbsp;Add Subjects
                                    </a>
                                </li>
                                <li>
                                    <a href="updateSubject.jsp" title="">
                                        <span class="glyphicon glyphicon-retweet"></span>
                                        &nbsp;Update Subject
                                    </a>
                                </li>
                                <li>
                                    <a href="removeSubject.jsp" title="">
                                        <span class="glyphicon glyphicon-trash"></span>
                                        &nbsp;Remove Subject
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
                                <li  class="active">
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
                <div class="row">
                <div class="col-xs-12 bg-default">
                    <form action="MainServlet" method="post" class="form-horizontal col-xs-12" style="height:100%;padding-top: 20px;">
                        <%
                            List<SubjectDetails> subjectDetailses = SubjectDao.getSubjectDetails();
                        %>
                        <div class="form-group col-xs-12" style="padding-top:40px;">
                            <div class="row">
                                <table class="col-xs-8 col-xs-offset-2" id="subjectTable" style="border:1px solid black;">
                                    <thead class="" style="">
                                        <tr class="">
                                            <th class="col-xs-4 text-center">Subject Id</th>
                                            <th class="col-xs-4 text-center">Subject Name</th>
                                            <th class="col-xs-4 text-center">Subject Type</th>
                                        </tr>
                                    </thead>
                                    <tbody class="">
                                        <%  if(subjectDetailses.size() > 0){
                                            for (int i = 0;i < subjectDetailses.size();i++ ) { %>
                                            <tr class="text-center">
                                                <td class="col-xs-4" style="padding: 10px;">
                                                    <input type="text" id="<%="subId"+i %>" name="<%="subId"+i %>" class="col-xs-10 col-xs-offset-1" value="<%=subjectDetailses.get(i).getSubjectId()%>" readonly>
                                                </td>
                                                <td class="col-xs-4">
                                                    <input type="text" name="<%="subName"+i %>" id="<%="subName"+i %>" class="col-xs-10 col-xs-offset-1" value="<%=subjectDetailses.get(i).getSubjectName()%>" required>
                                                </td>
                                                <td class="col-xs-4">
                                                    <select class="col-xs-10 col-xs-offset-1" name="<%="detType"+i %>" id="<%="detType"+i %>">
                                                        <option value="NT" <% if(subjectDetailses.get(i).getSubjectType().equals("NT")){ %>selected = "selected"<%}%> >Normal Theory</option>
                                                        <option value="ET" <% if(subjectDetailses.get(i).getSubjectType().equals("ET")){ %>selected = "selected"<%}%> >Elective Theory</option>
                                                        <option value="LB" <% if(subjectDetailses.get(i).getSubjectType().equals("LB")){ %>selected = "selected"<%}%> >Laboratory</option>
                                                    </select>
                                                </td>
                                            </tr>
                                        <% }} else { %> 
                                        <tr class="text-center">
                                            <td class="col-xs-4" style="padding: 10px;">
                                                <input type="text" id="rg" name="rg" class="col-xs-10 col-xs-offset-1" required>
                                            </td>
                                            <td class="col-xs-4">
                                                <input type="text" name="nm" id="nm" class="col-xs-10 col-xs-offset-1" required>
                                            </td>
                                            <td class="col-xs-4">
                                                <select class="col-xs-10 col-xs-offset-1" name="detType" id="detType">
                                                    <option value="NT">Normal Theory</option>
                                                    <option value="ET">Elective Theory</option>
                                                    <option value="LB">Laboratory</option>
                                                </select>
                                            </td>
                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
                            </div>
                            <div class="text-center">
                                <input type="button" class="btn btn-default btn-primary" onclick="addRow('subjectTable')" value="Add more">
                                <input type="hidden" value="updateSubject" name="action">
                                <input type="submit" class="btn btn-default btn-primary" value="Save">
                            </div>

                        </div>
                    </div>
                    </form>
                </div>
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