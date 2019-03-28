package com.rain.demo.model;

public class LeaferSingleton {
    private static Leafer leafer;
    private LeaferSingleton(){}
    public static Leafer getLeafer(){
        if(leafer == null){
            leafer = new Leafer();
        }
        return leafer;
    }
}
