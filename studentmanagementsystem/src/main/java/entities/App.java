package entities;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class App 
{
    public static void main( String[] args )
    {
        // create object for configuration
    	Configuration config=new Configuration().configure("hibernate.cfg.xml");
    	//create Session Factory
    	SessionFactory factory=config.buildSessionFactory();
    	// create a session object
    	Session session=factory.openSession();
    	/*-------- Entity Creation----------------------------*/
    	// Transaction
    	Transaction transaction=session.beginTransaction();
    	/*----- Create object of Employee entity-----*/
    	Employee emp=new Employee();
    	// emp is in transient state here
    	emp.setEmpid("emp104");
    	emp.setEmpname("Rahul");
    	emp.setSalary(7000);
    	/*------ Persisting emp into session-----*/
    	session.save(emp);
    	/*---at this time emp is in persistent state------*/
    	/*----- Commit the transaction-----*/
    	transaction.commit();
    	
    	System.out.println("Employee Inserted into employee table");
    	/*---- Closing the resources-----*/
    	session.close();
    	factory.close();
    }
}
