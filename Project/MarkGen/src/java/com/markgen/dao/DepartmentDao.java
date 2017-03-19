package com.markgen.dao;

import com.markgen.beans.DepartmentDetails;
import com.markgen.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDao {
    
    private static Session session;
    private static Transaction transaction;
    
    public static DepartmentDetails getDepartmentDetailsById(String departmentId){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            
            Query query = session.createQuery("from DepartmentDetails where departmentId = :n");
            query.setParameter("n", departmentId);
            
            if(query.list().size() > 0){
                
                return (DepartmentDetails) query.list().get(0);
                
            }
            return null;
        }
        finally{
            
            session.close();
            
        }
        
    }
    
    public static DepartmentDetails getDepartmentDetailsByName(String departmentName){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            
            Query query = session.createQuery("from DepartmentDetails where departmentName = :n");
            query.setParameter("n", departmentName);
            
            if(query.list().size() > 0){
                
                return (DepartmentDetails) query.list().get(0);
                
            }
            return null;
        }
        finally{
            
            session.close();
            
        }
        
    }
    
    public static void saveOrUpdateDepartment(DepartmentDetails departmentDetails){
        MarkGenDao.saveOrUpdateObject(departmentDetails);
    }
    
}

