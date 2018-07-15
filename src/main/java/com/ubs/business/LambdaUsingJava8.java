package com.ubs.business;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaUsingJava8 {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("sachin", "surve", "IT", 100),
                new Employee("Pravin", "surve", "Hardware", 150),
                new Employee("Ganesh", "Gaikward", "Business", 40),
                new Employee("Mangesh", "Bhande", "Banking", 60)
        );

        Collections.sort(employeeList, (p1, p2) -> p1.getFname().compareTo(p2.getFname()) );

        LambdaUsingJava8.Filter(employeeList, p1 -> p1.getLname().startsWith("s"));
        System.out.println("-------------------------------");
        LambdaUsingJava8.Filter(employeeList, p1 -> true);
    }

/*    public static  void Filter(List<Employee> emp, ConditionalFilter cf) {
        for (Employee e : emp
                ) {
            if (cf.applyFilter(e)) {
                System.out.println(e.toString());
            }

        }
    }
      */
   public static  void Filter(List<Employee> emp, Predicate<Employee> ef){
        for (Employee e : emp
             ) {
            if (ef.test(e)){
                System.out.println(e.toString());
            }

        }

    }



}
