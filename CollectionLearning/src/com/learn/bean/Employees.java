package com.learn.bean;

public class Employees implements Comparable<Employees> {

	private String employeeName;
	private int empId;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "[EmployeeName=" + employeeName + ", EmpId=" + empId + "]";
	}

	public Employees(int empId, String employeeName) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
	}

	public Employees(String string, int i) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
	}

	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		// if (o.empId == this.empId) {
		// return this.empId - o.empId;
		// } else {
		return -this.employeeName.compareTo(o.employeeName);
	}

}
