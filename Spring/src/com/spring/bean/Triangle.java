/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.bean;

/**
 *
 * @author vigneshwaran.b
 */
public class Triangle implements Shape {

    private Point trianglePoint;

    public Point getTrianglePoint() {
        return trianglePoint;
    }

    public void setTrianglePoint(Point trianglePoint) {
        this.trianglePoint = trianglePoint;
    }

    @Override
    public void draw() {
        System.out.println("Triangle Drawn with x = " + getTrianglePoint().getX() + " and Y = " + getTrianglePoint().getY());
    }

}
