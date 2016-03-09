package com.example.rohit.factory;

public class Laptop extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Laptop (String ram, String hdd, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }
}
