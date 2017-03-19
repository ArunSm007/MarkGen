/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.markgen.dao;

import com.markgen.beans.SemesterDetails;
import com.markgen.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

class SemesterDao{
    static Session session;
    
    public static SemesterDetails getSemesterDetails(int year,int semester,String dept){
        session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from SemesterDetails where year=:yr and departmentId=:dept and semesterNo=:sno");
        query.setParameter("yr", year);
        query.setParameter("dept", dept);
        query.setParameter("semesterNo", semester);
        
        List<SemesterDetails> semesterDetailses = query.list();
        
        if(semesterDetailses.size() == 1){
            return semesterDetailses.get(0);
        }
        
        SemesterDetails semesterDetails = new SemesterDetails();
        semesterDetails.setSemesterNo(semester);
        semesterDetails.setYear(year);
        DepartmentDao.getDepartmentDetailsById(dept).getSemesterDetailses().add(semesterDetails);
        MarkGenDao.saveOrUpdateObject(semesterDetails);
        return semesterDetails;
    }
}
