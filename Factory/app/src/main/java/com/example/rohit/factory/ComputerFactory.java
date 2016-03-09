package com.example.rohit.factory;

public class ComputerFactory {
    public static Computer getComputer (String type, String ram, String hdd, String cpu) {
        if ("Pc".equalsIgnoreCase(type)){
            return new Pc(ram,hdd,cpu);
        }else if ("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram,hdd,cpu);
        }else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram,hdd,cpu);
        }
        return null;
    }
}