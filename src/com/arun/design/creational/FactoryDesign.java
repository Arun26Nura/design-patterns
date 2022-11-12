package com.arun.design.creational;

interface Mobile{
    void operatingSystem();
}

class Android implements Mobile{

    @Override
    public void operatingSystem() {
        System.out.println("Android OS");
    }
}
class Iphone implements Mobile{

    @Override
    public void operatingSystem() {
        System.out.println("ios");
    }
}

class MobileFactory{

    public static Mobile getInstance(String os) {
        if(os.equals("ios"))
            return new Iphone();
        else
            return new Android();
    }
}

public class FactoryDesign {
    public static void main(String[] args) {
        Mobile mobile= MobileFactory.getInstance("ios");
       mobile.operatingSystem();
    }
}
