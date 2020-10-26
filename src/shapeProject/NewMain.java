/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;



/**
 *
 * @author moha7150
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        Shape a = new Wheel();
        Shape b = new Rect();
        Circle c = new Wheel();
    }
    
}
