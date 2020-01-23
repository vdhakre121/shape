public class Triangle extends Shape
{
    private double base;
    private double height;
    
    public void setBase(double base){
        this.base=base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double area(){
        return (double)1/2*base*height;
    }
    public double volume(){
        return -1;
    }
}