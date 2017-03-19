
package com.markgen.dao;

import com.markgen.beans.DeadlineDetails;
import com.markgen.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeadlineDao {
    static Session session;
    static SessionFactory sessionFactory;
    
    public static DeadlineDetails getDeadlineDetails(int year,int semesterNo,String detType){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from DeadlineDetails where year=:yr and semno=:sno and detType=:dt");
        query.setParameter("yr", year);
        query.setParameter("sno", semesterNo);
        query.setParameter("dt", detType);
        
        List<DeadlineDetails> deadlineDetailses = query.list();
        if(deadlineDetailses.size() == 1){
            return deadlineDetailses.get(0);
        }
        DeadlineDetails deadlineDetails = new DeadlineDetails();
        deadlineDetails.setSemno(semesterNo);
        deadlineDetails.setDetType(detType);
        deadlineDetails.setYear(year);
        
        return deadlineDetails;
    }
    
    public static void setDeadlineDetails(DeadlineDetails deadlineDetails){
        MarkGenDao.saveOrUpdateObject(deadlineDetails);
    }
}
