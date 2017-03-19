package com.markgen.dao;

import com.markgen.beans.StaffDetails;
import com.markgen.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginDao {
    
    private static Session session;
    private static Transaction transaction;
    
    public static int validateUser(String username,String password){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try{
            Query query = session.createQuery("from StaffDetails where staffId = :un");
            query.setParameter("un", username);

            List result = query.list();

            if(result.size() == 1){

                StaffDetails staffDetails = (StaffDetails) result.get(0);

                if(staffDetails.getStaffPassword().equals(password)){

                    if(!staffDetails.isActiveStatus()){

                        staffDetails.setActiveStatus(true);
                        staffDetails.setLoginTime(new Date());
                        staffDetails.setLogoutTime(null);
                        session.update(staffDetails);
                        transaction.commit();
                        
                        return 1;
                    }

                    return 2;

                }
                return 0;
            }

            return -1;
        }
        finally{
            session.close();
        }
        
    }
    
    public static int changePassword(String username,String password){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            
            Query query = session.createQuery("from StaffDetails where staffId = :un");
            query.setParameter("un", username);

            List result = query.list();

            if(result.size() == 1){

                StaffDetails staffDetails = (StaffDetails) result.get(0);
                staffDetails.setStaffPassword(password);

                session.update(staffDetails);
                transaction.commit();
                
                return 1;

            }
            
            return 0;
        }
        finally{
            session.close();
        }
      
    }
    
    public static int logoutUser(String username){
        
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        try{
            Query query = session.createQuery("from StaffDetails where userName = :un");
            query.setParameter("un", username);

            List result = query.list();

            if(result.size() == 1){

                StaffDetails staffDetails = (StaffDetails) result.get(0);

                if(staffDetails.getLogoutTime() == null){
                    
                    staffDetails.setActiveStatus(false);
                    staffDetails.setLogoutTime(new Date());
                    
                    session.update(staffDetails);
                    transaction.commit();
                    
                    return 1;
                }
            }

            return -1;

        }
        finally{
            session.close();
        }
    }
}
