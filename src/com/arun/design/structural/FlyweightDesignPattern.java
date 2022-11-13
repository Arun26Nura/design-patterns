package com.arun.design.structural;

import java.util.HashMap;
import java.util.Map;

interface Employee{
    void assignSkill(String skill);
    void task();
}

class Developer implements Employee{
    private String task;
    private String skill;

    public Developer(){
        task="development";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill=skill;
    }

    @Override
    public void task() {
        System.out.println("Skill is : "+ skill + "Task is : "+ task);
    }
}
class Tester implements Employee {
    private String task;
    private String skill;

    public Tester() {
        task = "testing";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Skill is : " + skill + "Task is : " + task);
    }
}
class EmployeeTaskManagement{
    static Map<String, Employee> map= new HashMap<>();

    public static Employee getEmployee(String type){
        Employee employee=null;

        if(!map.containsKey(type)){
            switch (type) {
                case "developer":
                    employee = new Developer();
                    break;
                case "tester":
                    employee = new Tester();
                    break;
                default:
                    break;
            }
            map.put(type, employee);
        }
        return map.get(type);

    }
}


public class FlyweightDesignPattern {
    public static void main(String[] args) {
        Employee employee= EmployeeTaskManagement.getEmployee("developer");
        employee.assignSkill("java");
        System.out.println(employee);
        Employee employee1= EmployeeTaskManagement.getEmployee("tester");
        employee1.assignSkill("java");
        System.out.println(employee1);
        Employee employee2= EmployeeTaskManagement.getEmployee("developer");
        employee2.assignSkill("java");
        System.out.println(employee2);
        Employee employee4= EmployeeTaskManagement.getEmployee("tester");
        employee4.assignSkill("java script");
        System.out.println(employee4);
    }
}

