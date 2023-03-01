package com.demoClass;

public class EmpClone  implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
	 
		EmpClone emp = (EmpClone) super.clone();
	  emp.setAddress ((Address) address.clone());
		
		return emp;
	}
	public int id;
	public String name;
	public int salary;
    public  Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EmpClone(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmpClone [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}
