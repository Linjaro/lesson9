/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import TurtleGraphics.Pen;

/**
 *
 * @author moha7150
 */
public class Triangle extends Shape{
    private double x2,y2,x3,y3;
    public Triangle(int x1, int y1,int xx2, int yy2,int xx3, int yy3){
    super(x1,y1);
    x2 = xx2;
    x3 = xx3;
    y2 = yy2;
    y3 = yy3;
    
    }

    @Override
    public double area() {
        return Math.abs((x*y2-x2*y) + (x2*y3-x3*y2) + (x3*y-x*y3)) / 2;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x, y);
        p.down();
        p.move(x2, y2);
        p.move(x3,y3);
        p.move(x, y);
    }
    @Override
    public double perimiter(){
        return (Math.sqrt((x-x2)*(x-x2) + (y-y2) * (y-y2))+Math.sqrt((x2-x3)*(x2-x3) + (y2-y3) * (y2-y3))+Math.sqrt((x3-x)*(x3-x) + (y3-y) * (y3-y)));
    }

    @Override
    public void stretchBy(double factor) {
        x2= (x2-x) * factor + x;
        x3= (x3-x) * factor + x;
        y2= (y2-y) * factor + y;
        y3= (y3-y) * factor + y;
        
    }
    @Override 
    public void move(double xx,double yy){
        double diffx = xx-x;
        double diffy = yy-y;
        x +=diffx;
        x2 +=diffx;
        x3 +=diffx;
        y +=diffy;
        y2 +=diffy;
        y3 +=diffy;
    }
    @Override 
    public String toString(){
    return ("Triangle\n" +"Perimiter: " + this.perimiter()+ "\n"+super.toString() );
    }
}
