package com.markgen.dao;

import com.markgen.beans.DepartmentDetails;
import com.markgen.beans.SemesterDetails;
import com.markgen.beans.SubjectDetails;
import com.markgen.beans.SubjectList;
import com.markgen.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SubjectDao {

    private static Session session;

    public static SubjectDetails getSubjectDetailsById(String subjectId) {
        session = HibernateUtil.getSessionFactory().openSession();
        return (SubjectDetails) session.get(SubjectDetails.class, subjectId);
    }

    public static void deleteSubject(SubjectDetails subjectDetails) {
        MarkGenDao.deleteObject(subjectDetails);
    }
    
    public static List<SubjectDetails> getSubjectDetails(){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from SubjectDetails");
        return query.list();
    }
    
    public static void allocateSubject(int year, int semester, String department, List<SubjectList> subjectIdList) {
        
        SemesterDetails semesterDetails = SemesterDao.getSemesterDetails(year, semester, department);
        semesterDetails.setSubjectLists(subjectIdList);
        
    }
}