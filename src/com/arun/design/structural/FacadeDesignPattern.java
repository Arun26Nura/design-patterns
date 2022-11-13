package com.arun.design.structural;

interface Hotel{
    String getHotelMenu();
}
class VegHotel implements Hotel{
    @Override
    public String getHotelMenu() {
        return "Veg Items";
    }
}
class NonVegHotel implements Hotel{
    @Override
    public String getHotelMenu() {
        return " Non Veg Items";
    }
}
class BothHotel implements Hotel{
    @Override
    public String getHotelMenu() {
        return " Veg and Non Veg Items";
    }
}

class HotelFacade {
    private static HotelFacade instance= new HotelFacade();
    public static HotelFacade getInstance(){
        return instance;
    }
    public String getVegMenu(){
        return new VegHotel().getHotelMenu();
    }
    public String getNonVegMenu(){
        return new NonVegHotel().getHotelMenu();
    }
    public String getBothMenu(){
        return new BothHotel().getHotelMenu();
    }
}


public class FacadeDesignPattern {
    public static void main(String[] args) {
        System.out.println(HotelFacade.getInstance().getVegMenu());
    }
}
