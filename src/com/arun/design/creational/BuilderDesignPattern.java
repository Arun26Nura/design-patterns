package com.arun.design.creational;

class Vehicle{
    private String name;
    private int wheel;
    private int airbags;

    Vehicle(VehicleBuilder vehicleBuilder){
        this.name=vehicleBuilder.getName();
        this.wheel=vehicleBuilder.getWheel();
        this.airbags= vehicleBuilder.getAirbags();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", airbags=" + airbags +
                '}';
    }
}

class VehicleBuilder{
    public static  VehicleBuilder instance;
    private String name;
    private int wheel;
    private int airbags;

    public String getName() {
        return name;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    public static VehicleBuilder getInstance() {
        if(instance ==null)
            instance=new VehicleBuilder();
        return instance;
    }

    public VehicleBuilder name(String name){
        this.name=name;
        return this;
    }
    public VehicleBuilder wheel(int wheel){
        this.wheel=wheel;
        return this;
    }
    public VehicleBuilder airbags(int airbags){
        this.airbags=airbags;
        return this;
    }
    public Vehicle build(){
        return new Vehicle(this);
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleBuilder.getInstance().name("car").airbags(2).wheel(4).build();
        System.out.println(vehicle);
    }
}
