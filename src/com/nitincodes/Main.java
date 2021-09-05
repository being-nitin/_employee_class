package com.nitincodes;
// java program to create three different objects to fetch the data of three employees:
class Employee{
    int yearOfJoining;
    String name;
    String address;

    public void m1(){
        System.out.println(yearOfJoining);
        System.out.println(name);
        System.out.println(address);
    }

}
public class Main {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.name = "Aman";
        emp1.yearOfJoining = 2021;
        emp1.address = "Chandigarh";
        emp2.name = "Sunil";
        emp2.yearOfJoining = 2000;
        emp2.address = "Agra";
        emp3.yearOfJoining = 2010;
        emp3.name = "Rohan";
        emp3.address = "Mathura";
        emp1.m1();
        emp2.m1();
        emp3.m1();
    }
}
