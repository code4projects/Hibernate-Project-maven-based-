package entities;
import javax.persistence.*;

@Entity
public class Employee
{
	@Id
	private String empid;
	private String empname;
	private int salary;
	
	/*---- Default Constructor----*/
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*-------Parameterized constructor-------*/
	public Employee(String empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	/*-----------------------------------------------------------------*/
	public String getEmpid() {
		return empid;
	}
	
	

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
