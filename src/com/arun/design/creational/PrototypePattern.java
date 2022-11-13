package com.arun.design.creational;

import java.util.ArrayList;
import java.util.List;

class MotorBike implements Cloneable{

    private List<String> bikeList;

    public List<String> getBikeList() {
        return bikeList;
    }
    public void addBike(String bike) {
        this.bikeList.add(bike);
    }

    public MotorBike(List<String> bikeList){
       this.bikeList= bikeList;
    }

    public MotorBike(){
        this.bikeList= new ArrayList<>();
    }


    @Override
    public MotorBike clone() {
        List<String> tempList= new ArrayList<>();
        tempList.addAll(this.bikeList);
        return new MotorBike(tempList);
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        MotorBike a= new MotorBike();
        System.out.println(a.getBikeList());
        MotorBike b = a.clone();
        b.addBike("Yamaha");
        System.out.println(b.getBikeList());
        MotorBike c = b.clone();
        c.addBike("Bajaj");
        System.out.println(c.getBikeList());
    }
}
