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
public class Circle implements Shape {

    private Point point;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public void draw() {
        System.out.println("Circle Drawn with x = " + point.getX() + " and Y = " + point.getY());

    }

}
