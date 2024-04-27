package com.example.geometry;

public class circle {
    private float radius;

    public circle(float radius){
        this.radius = radius;
    }
//    public circle(){
//
//    }

    public double getRadius() {
        return Math.PI * radius * radius;
    }
}
