package com.arun.design.structural;

interface Movable {
    // returns speed in MPH
    double getSpeed();
}

 class Honda implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}

interface MovableAdapter {
    // returns speed in KM/H
    double getSpeed();
}


class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

   public MovableAdapterImpl(Movable luxuryCars){
        this.luxuryCars=luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}



public class AdapterDesignPattern {
    public static void main(String[] args) {
        Movable car= new Honda();
        MovableAdapter movableAdapter= new MovableAdapterImpl(car);
        System.out.println(movableAdapter.getSpeed());
    }
}
