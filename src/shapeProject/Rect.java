
package shapeProject;


import TurtleGraphics.Pen;


public class Rect extends Shape{
    private double w,h;
    public Rect(){
        super();w=1;h=1;
    }
    public Rect(double xx,double yy,double ww,double hh){
        super(xx,yy);w=ww;h=hh;
    }
    @Override
    public double area() {
        return w*h;
    }

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

    
    public void stretchBy(double factor) {
        w *= factor;h*=factor;
    }
    
    public String toString(){
        String strr = ("RECTANGLE"+"\nWidth x Height: "+w+" x "+h+"\n"+"Perimiter: "+this.perimiter()+super.toString());
        return (strr);
    }

    @Override
    public double perimiter() {
        return w*h;
    }
}
