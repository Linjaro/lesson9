/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;


import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author moha7150
 */
public class DrawShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape x = new Rect(100,-50,200,75);
        Shape e = new Circle(50,50,100);
        Shape z = new Wheel(-200,100,75,10);
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        p.setColor(Color.red);
        x.draw(p);
        p.setColor(Color.green);
        e.draw(p);
        p.setColor(Color.blue);
        z.draw(p);
        
        Scanner s = new Scanner(System.in);
        s.next();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200,-200);
        p.setColor(Color.red);
        ((Wheel)z).setSpokes(1000);
        x.draw(p);
        z.draw(p);
        
        
    }
    
}
