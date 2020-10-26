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
public class Circle extends Shape{
    
    protected double r;
    public Circle (){
        super();
        r=0;
    }
    public Circle (double xx,double yy,double rr){
        super(xx,yy);
        r=rr;
    
    }
    
    public double area() {
        return Math.PI*r*r;
    }

    
    public void draw(Pen p) {
        double side = 2*Math.PI*r/120;
        p.up ();
        p.move(x,y);
        
        p.setDirection(0);
        p.move(r);
        p.setDirection(90);
        p.down();
        for (int i = 1; i <= 120; i++) {
            p.move(side);
            p.turn(3);
        }
        
    }

    
    public void stretchBy(double factor) {
        r *= factor;
    }
    
    public String toString(){
        return ("CIRCLE\n"+"Radius: "+r+super.toString());
    }
}
