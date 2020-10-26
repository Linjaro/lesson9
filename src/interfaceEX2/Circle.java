/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEX2;

import TurtleGraphics.Pen;

/**
 *
 * @author moha7150
 */
public class Circle implements Shape{
    
    protected double x,y,r;
    public Circle (double xx,double yy,double rr){
        x=xx;
        y=yy;
        r=rr;
    
    }
    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
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

    @Override
    public double getXPos() {
        return x;
    }

    @Override
    public double getYPos() {
        return y;
    }

    @Override
    public void move(double xloc, double yloc) {
        x = xloc;y=yloc;
    }

    @Override
    public void stretchBy(double factor) {
        r *= factor;
    }
    @Override
    public String toString(){
        return ("CIRCLE\n"+"Radius: "+r+"\nx,y:"+x+" , "+y+"\nArea: "+area());
    }
}
