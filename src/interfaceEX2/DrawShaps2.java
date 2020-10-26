/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEX2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

/**
 *
 * @author moha7150
 */
public class DrawShaps2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        Shape shapes[] = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i]=getRandomShape();
            p.setColor(grc());
            shapes[i].draw(p);
            System.out.println(shapes[i]);
        }
    }
    
    public static Color grc(){
        int r = (int)(Math.random() *256);
        int g = (int)(Math.random() *256);
        int b = (int)(Math.random() *256);
        return new Color(r,g,b);
        
    }
    public static Shape getRandomShape(){
        Shape s;
        int rx,ry,rr,rw,rh,randshp;
        rx = (int)(Math.random() * 600-300);
        ry = (int)(Math.random() * 600-300);
        rr = (int)(Math.random() * 180+10);
        rw = (int)(Math.random() * 250+10);
        rh = (int)(Math.random() * 250+10);
        int rs = (int)(Math.random() * 100+3);
        randshp = (int)(Math.random() *3+1);
        
        if(randshp ==1){
            s= new Rect(rx,ry,rw,rh);
        }
        else if (randshp==2){
            s= new Wheel(rx,ry,rr,rs);
        }
        else{
            s= new Circle(rx,ry,rr);
            
        }
        return s;
    }
    
}
