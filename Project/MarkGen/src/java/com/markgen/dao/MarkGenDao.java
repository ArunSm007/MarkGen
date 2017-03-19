
package com.markgen.dao;

import com.markgen.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MarkGenDao {
    private static Session session;
    private static Transaction transaction;
    
    public static void saveOrUpdateObject(Object obj){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
                              
            session.saveOrUpdate(obj);
            transaction.commit();
            
        }
        finally{
            session.close();
        }
        
    }
    
    public static void deleteObject(Object obj){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
                              
            session.delete(obj);
            transaction.commit();
            
        }
        finally{
            session.close();
        }
        
    }
   
}
