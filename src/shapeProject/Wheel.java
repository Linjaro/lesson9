/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;


import TurtleGraphics.*;

/**
 *
 * @author moha7150
 */
public class Wheel extends Circle{
    private int spokes;
    private static int wheelCount=0;
    private static double avgSize=0;
    public Wheel(){
        super();
        spokes = 3;
    }
    
    public Wheel(double xx, double yy, double rr,int s) {
        super(xx, yy, rr);
        spokes = s;
        wheelCount ++;
        avgSize+=area();
    }
    
    public static int getWheelCount(){
        return wheelCount;
    }
    public static double getAvgArea(){
        return (double)avgSize/wheelCount;
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
        return ("WHEEL\n"+"Radius: "+r+"\n# of Spokes:" +spokes+"\nX , Y:"+x+" , "+y+"\nArea: "+area());
    }
}
