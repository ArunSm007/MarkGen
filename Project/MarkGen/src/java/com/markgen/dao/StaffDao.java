/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markgen.dao;

import com.markgen.beans.StaffDetails;
import com.markgen.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Arun
 */
public class StaffDao {
    private static Session session;
    private static Transaction transaction;
    
    public static StaffDetails getStaffDetailsById(String staffId){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            
            Query query = session.createQuery("from StaffDetails where staffId = :n");
            query.setParameter("n", staffId);
            
            if(query.list().size() > 0){
                
                return (StaffDetails) query.list().get(0);
                
            }
            return null;
        }
        finally{
            
            session.close();
            
        }
        
    }
    
    public static StaffDetails getStaffDetailsByName(String staffName){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            
            Query query = session.createQuery("from StaffDetails where staffName = :n");
            query.setParameter("n", staffName);
            
            if(query.list().size() > 0){
                
                return (StaffDetails) query.list().get(0);
                
            }
            return null;
        }
        finally{
            
            session.close();
            
        }
        
    }
    
    public static void saveOrUpdateStaff(StaffDetails staffDetails){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
                              
            session.saveOrUpdate(staffDetails);
            transaction.commit();
            
        }
        finally{
            session.close();
        }
        
    }
}
