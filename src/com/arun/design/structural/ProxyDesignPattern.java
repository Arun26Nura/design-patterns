package com.arun.design.structural;

import java.util.List;

interface Internet{
    public void connectToInternet(String website);
}

class InternetImpl implements Internet{
    @Override
    public void connectToInternet(String website) {
        System.out.println("Connected to : "+ website);
    }
}
class InternetProxy implements Internet{
   Internet internet= new InternetImpl();
   List<String>  bannedSites= List.of("abc.com","adf.com");

    @Override
    public void connectToInternet(String website) {
    if(bannedSites.contains(website))
        System.out.println("Connection denied");
    else
        internet.connectToInternet(website);

    }
}

public class ProxyDesignPattern {
    public static void main(String[] args) {
        Internet internet= new InternetProxy();
        internet.connectToInternet("abc.com");
        internet.connectToInternet("hello.com");
    }
}
