package com.example.geometry;

public class rectangle {
    private float length;
    private float width;
    public rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }
//    public rectangle(){
//
//    }
    public double get_area(){
        return length * width;
    }
}
