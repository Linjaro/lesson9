/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEX2;

import TurtleGraphics.*;

/**
 *
 * @author moha7150
 */
public class Wheel extends Circle{
    private int spokes;

    
    
    public Wheel(double xx, double yy, double rr,int s) {
        super(xx, yy, rr);
        spokes = s;
    }
    
    public void draw (Pen p){
        super.draw(p);
        for (int i = 1; i <=spokes ; i++) {
            p.up();
            p.move(x, y);
            p.down();
            p.setDirection(i*360/spokes);
            p.move(r);
        }
        
    }
    public void setSpokes(int s){
        spokes=s;
    }
    
    public String toString(){
        return ("WHEEL\n"+"Radius: "+r+"\nx,y:"+x+" , "+y+"\n# of Spokes:" +spokes+"\nArea: "+area());
    }
}
