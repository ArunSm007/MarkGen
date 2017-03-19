
package com.markgen.dao;

import com.markgen.beans.AdvisorDetails;
import com.markgen.beans.ClassDetails;
import com.markgen.beans.DepartmentDetails;
import com.markgen.beans.SemesterDetails;
import com.markgen.beans.StudentList;
import com.markgen.beans.SubjectHandlingFacultyDetails;
import com.markgen.beans.SubjectStudentDetails;
import static com.markgen.dao.SemesterDao.session;
import com.markgen.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClassDao {
    private static Session session;
    
    public static ClassDetails getClassDetails(int year,String dept,String section,String regulationId){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from ClassDetails where year=:yr and departmentId=:dept and section=:sec");
        query.setParameter("yr", year);
        query.setParameter("dept", dept);
        query.setParameter("sec", section);
        
        List<ClassDetails> classDetailses = query.list();
        
        if(classDetailses.size() == 1){
            return classDetailses.get(0);
        }
        
        ClassDetails classDetails = new ClassDetails();
        classDetails.setYear(year);
        classDetails.setSection(section);
        classDetails.setRegulationId(regulationId);
        classDetails.setClassId(year+dept+section);
        DepartmentDetails details = DepartmentDao.getDepartmentDetailsById(dept);
        if(details.getClassDetailses()==null)
            details.setClassDetailses(new ArrayList<>());
        details.getClassDetailses().add(classDetails);
        MarkGenDao.saveOrUpdateObject(details);
        return classDetails;
    }
    
    public static void setClassDetails(ClassDetails classDetails,List<StudentList> studentLists) {
        classDetails.setStudentLists(studentLists);
        MarkGenDao.saveOrUpdateObject(classDetails);
    }
    
    public static void setClassStudentDetails(ClassDetails classDetails,List<StudentList> studentLists) {
        classDetails.setStudentLists(studentLists);
        MarkGenDao.saveOrUpdateObject(classDetails);
    }
    
    public static void setClassAdvisorDetails(ClassDetails classDetails,List<AdvisorDetails> advisorLists) {
        classDetails.setAdvisorDetails(advisorLists);
        MarkGenDao.saveOrUpdateObject(classDetails);
    }
    
    public static void setSubjectHandlingFacultyDetails(ClassDetails classDetails,List<SubjectHandlingFacultyDetails> subjectHandlingFacultyDetailses) {
        classDetails.setFaculties(subjectHandlingFacultyDetailses);
        MarkGenDao.saveOrUpdateObject(classDetails);
    }
    
}
