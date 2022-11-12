package com.arun.design.creational;

class Singleton {
    private static Singleton instance= new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(instance ==null)
            instance=new SingletonLazy();

        return instance;
    }
}

class SingletonSynchronized{
    private static SingletonSynchronized instance;
    private SingletonSynchronized(){}

    public static synchronized SingletonSynchronized getInstance() {
        if(instance ==null)
            instance=new SingletonSynchronized();

        return instance;
    }
}

class SingletonSynchronizedBlock{
    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){}

    public static  SingletonSynchronizedBlock getInstance() {
        if(instance ==null) {
            synchronized (SingletonSynchronizedBlock.class) {
                if(instance==null) {
                    instance = new SingletonSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}

public class SingletonExample{

    public static void main(String[] args) {
        SingletonLazy singleton1= SingletonLazy.getInstance();
        System.out.println(singleton1);
        SingletonLazy singleton2= SingletonLazy.getInstance();
        System.out.println(singleton2);
    }

}


