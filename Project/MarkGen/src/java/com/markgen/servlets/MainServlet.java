package com.markgen.servlets;

import com.markgen.beans.DeadlineDetails;
import com.markgen.beans.StaffDetails;
import com.markgen.beans.StudentDetails;
import com.markgen.beans.SubjectDetails;
import com.markgen.dao.DeadlineDao;
import com.markgen.dao.LoginDao;
import com.markgen.dao.MarkGenDao;
import com.markgen.dao.StaffDao;
import com.markgen.dao.StudentDao;
import com.markgen.dao.SubjectDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pageIdentifier = request.getParameter("action");
        System.out.println("com.markgen.servlets.MainServlet.processRequest()"+"\n"+pageIdentifier);
        switch(pageIdentifier){
            case    "login"         :    validateUser(request, response);
                                            break;
            case    "addStudent"    :    addStudent(request, response);
                                            break;
            case    "removeStudent" :    removeStudent(request, response);
                                            break;
            case    "deadline"      :    addDeadline(request, response);
                                            break;
            case    "updateSubject" :    updateSubjects(request, response);
                                            break;
        }
    }
    
    protected void allocateSubjects(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    protected void removeSubject(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
    }
    
    protected void updateSubjects(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Enumeration e = request.getParameterNames();
        String subjectId;
        String subjectName;
        String subjectType;
        String pname = "";
        pname = (String)e.nextElement();
        while(e.hasMoreElements() && !pname.equals("action")){
            subjectId = request.getParameter(pname);
            pname = (String)e.nextElement();
            subjectName = request.getParameter(pname);
            pname = (String)e.nextElement();
            subjectType = request.getParameter(pname);
            pname = (String)e.nextElement();
            SubjectDetails subjectDetails = SubjectDao.getSubjectDetailsById(subjectId);
            if(subjectDetails == null){
                subjectDetails = new SubjectDetails();
                subjectDetails.setSubjectId(subjectId);
            }
            subjectDetails.setSubjectName(subjectName);
            subjectDetails.setSubjectType(subjectType);
            MarkGenDao.saveOrUpdateObject(subjectDetails);
        }
        request.getRequestDispatcher("updateSubjects.jsp").forward(request, response);
     }
    
    protected void addDeadline(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int year = Integer.parseInt(request.getParameter("year"));
            int semester = Integer.parseInt(request.getParameter("sem"));
            String designation = request.getParameter("det");
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date fromDate;
            Date toDate;
            fromDate = df.parse(request.getParameter("fromDate"));
            toDate = df.parse(request.getParameter("toDate"));
            DeadlineDetails deadlineDetails = DeadlineDao.getDeadlineDetails(year, semester, designation);
        
            deadlineDetails.setFromDate(fromDate);
            deadlineDetails.setLastDate(toDate);
            
            MarkGenDao.saveOrUpdateObject(deadlineDetails);
            request.getRequestDispatcher("deadline.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }

    protected void removeStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         StudentDetails std = StudentDao.getStudentDetailsById(request.getParameter("studentId")); 
         if(std != null){
             StudentDao.deleteStudent(std);
             request.getSession(false).setAttribute("studentId", std.getStudentId());
             request.getSession(false).setAttribute("removeStatus", "true");
             request.getRequestDispatcher("removeStudent.jsp").forward(request, response);
         }
         else{
             request.getSession(false).setAttribute("studentId", request.getParameter("studentId"));
             request.getSession(false).setAttribute("removeStatus", "false");
             response.sendRedirect("removeStudent.jsp");
         }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected void addStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("com.markgen.servlets.MainServlet.addStudent()");
        
        Enumeration e=request.getParameterNames();
        
        StudentDetails studentDetails;
        int yoc = Integer.parseInt(request.getParameter((String)e.nextElement()));
        String dept = request.getParameter((String)e.nextElement());
        
        List<StudentDetails> detailses = new ArrayList<>();
        
        int regno;
        String name;
        String reqparam = (String)e.nextElement();
        
        while(!reqparam.equals("action")){
            studentDetails = new StudentDetails();
            studentDetails.setStudentId(request.getParameter(reqparam));
            studentDetails.setStudentName(request.getParameter((String)e.nextElement()));
            studentDetails.setDepartment(dept);
            studentDetails.setYearOfJoining(yoc);
            
            MarkGenDao.saveOrUpdateObject(studentDetails);
            
            reqparam = (String)e.nextElement();
            detailses.add(studentDetails);
        }
        response.sendRedirect("addStudent.jsp");
    }
    
    protected void validateUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.println("com.markgen.servlets.MainServlet.validateUser()");
            String userName = request.getParameter("userName");
            String password = request.getParameter("passWord");
            
            int result = LoginDao.validateUser(userName, password);
            
            HttpSession session = request.getSession(false);
            if(session == null){
                session = request.getSession();
            }
            if(result == 1){
                StaffDetails staffDetails = StaffDao.getStaffDetailsById(userName);
                session.setAttribute("userName", userName);
                if(staffDetails.getDesignation().equals("H")){
                    request.getRequestDispatcher("/hodHome.jsp").forward(request, response);
                }
                else if(staffDetails.getDesignation().equals("C")){
                    request.getRequestDispatcher("/coeHome.jsp").forward(request, response);
                }
                else if(staffDetails.getDesignation().equals("F")){
                    request.getRequestDispatcher("/staffHome.jsp").forward(request, response);
                }
            }
            else if(result == 2){
                session.setAttribute("status", "User Already Active");
                response.sendRedirect("index.jsp");
            }
            else if(result == 0){
                session.setAttribute("status", "Invalid Password");
                response.sendRedirect("index.jsp");
            }
            else{
                session.setAttribute("status", "Invalid Username");
                response.sendRedirect("index.jsp");
            }
    }

}
