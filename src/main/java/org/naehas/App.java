package org.naehas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Project Started!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Employee employee = new Employee();
        employee.setId(100);
        employee.setName("Ankit Yadav");
        employee.setSalary(15000);
        System.out.println(employee);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.save(employee);
        tx.commit();
        session.close();

    }
}
