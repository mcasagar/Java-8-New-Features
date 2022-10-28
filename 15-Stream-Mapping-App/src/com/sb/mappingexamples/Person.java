package com.sb.mappingexamples;

public class Person {
	private String name;
	private String job;
	private long phno;
	
	public Person() {
		System.out.println("Person.Person()");
	}
	public Person(String name, String job, long phno) {
		super();
		this.name = name;
		this.job = job;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", phno=" + phno + "]";
	}
	
	
}
