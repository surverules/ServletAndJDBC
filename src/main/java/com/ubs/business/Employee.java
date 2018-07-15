package com.ubs.business;

public class Employee {

    private  String fname;
    private  String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    private  String dept;
    private  double salary;

    public Employee(String fname, String lname, String dept, double salary){
        this.fname = fname;
        this.lname = lname;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(){

    }

    public String toString(){
        return "Employee Info: Fname: " +fname + " Lname: " + lname + " Dept: " + dept + " salary: " + salary;
    }
}
