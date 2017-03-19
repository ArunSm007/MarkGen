
package com.markgen.dao;

import com.markgen.beans.StudentDetails;
import com.markgen.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    private static Session session;
    private static Transaction transaction;
    
    public static StudentDetails getStudentDetailsById(String studentId){
        session = HibernateUtil.getSessionFactory().openSession();
        return (StudentDetails)session.get(StudentDetails.class, studentId);
    }
    
    public static List<StudentDetails> getStudentDetails(){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from StudentDetails");
        return (List<StudentDetails>)query.list();
    }
    
    public static List<StudentDetails> getStudentDetailsByDept(String dept){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from StudentDetails where department=:dept");
        query.setParameter("dept", dept);
        return (List<StudentDetails>)query.list();
    }
    
    public static void deleteStudent(StudentDetails studentDetails){
        MarkGenDao.deleteObject(studentDetails);
    }
}
