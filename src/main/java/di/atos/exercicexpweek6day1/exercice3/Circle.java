/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek6day1.exercice3;

/**
 *
 * @author ezekielkouassi
 */
public class Circle {
    
    private double radius = 1.0;
    private String color = "red";
    
    public Circle() { }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString() {
        return "Circle[ color:" + this.color + "radius: " + this.radius + "]";
    }
    
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
