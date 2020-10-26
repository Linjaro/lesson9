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
public class Rect implements Shape{
    private double x,y,w,h;
    public Rect(){
        x=0;y=0;w=1;h=1;
    }
    public Rect(double xx,double yy,double ww,double hh){
        x=xx;y=yy;w=ww;h=hh;
    }
    @Override
    public double area() {
        return w*h;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x,y);
        p.down();
        p.setDirection(0);
        p.move(w);
        p.turn(-90);
        p.move(h);
        p.turn(-90);
        p.move(w);
        p.turn(-90);
        p.move(h);
        p.turn(-90);
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
        w *= factor;h*=factor;
    }
    @Override
    public String toString(){
        return ("CIRCLE\n"+"Width x Height: "+w+" x "+h+"\nx,y:"+x+" , "+y+"\nArea: "+area());
    }
}
