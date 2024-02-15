package com.kodnest;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
       // System.out.println(session +" success");
        
        Transaction tr = session.beginTransaction();
        Student s = new Student(1, "John");
        session.save(s);
        tr.commit();
        session.close();
        factory.close();
        }
}
