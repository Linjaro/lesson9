package shapeProject;


import TurtleGraphics.Pen;

public abstract class Shape {
    protected double x,y;
    public Shape (){
        x=0;y=0;
    }
    public Shape(double xx,double yy){
    x=xx;y=yy;   
    }
    
    abstract public double area();
    abstract public void draw(Pen p);
    final public double getXPos() {
        return x;
    }
    final public double getYPos() {
        return y;
    }
    public void move(double xloc,double yloc){
        x = xloc;
        y=yloc;
    }
    abstract public void stretchBy(double factor);
    
    
    public String toString(){
        return ("\nX , Y:"+x+" , "+y+"\nArea: "+area());
    }
    
}
