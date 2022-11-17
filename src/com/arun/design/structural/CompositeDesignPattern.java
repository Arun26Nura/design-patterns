package com.arun.design.structural;

import java.util.ArrayList;
import java.util.List;

interface Employees{
    void showEmployeeDetail();
}

class Lead implements Employees{
    private String name;
    private String position="lead";

    public  Lead(String name){
        super();
        this.name=name;

    }
    @Override
    public void showEmployeeDetail() {
        System.out.println(name +" : "+ position);
    }

}
class Manager implements Employees{
    private String name;
    private String position="manager";

    public  Manager(String name){
        super();
        this.name=name;
    }
    @Override
    public void showEmployeeDetail() {
        System.out.println(name +" : "+ position);
    }

}

class CompanyDatabase implements Employees{

    List<Employees> employeesList= new ArrayList<>();

    public void addEmployees(Employees e){
        this.employeesList.add(e);
    }
    @Override
    public void showEmployeeDetail() {
        employeesList.forEach(Employees::showEmployeeDetail);
    }
}

public class CompositeDesignPattern {
    public static void main(String[] args) {
        CompanyDatabase companyDatabase= new CompanyDatabase();
        companyDatabase.addEmployees(new Lead("Arun"));
        companyDatabase.addEmployees(new Manager("Manager"));
        companyDatabase.showEmployeeDetail();
    }
}
