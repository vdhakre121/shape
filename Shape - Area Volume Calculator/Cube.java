public class Cube extends Shape implements Spatial
{
    private double length;
    private double width;
    private double height;
    
    public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double area(){
        return (double)(2*length*width)+(2*length*height)+(2*width*height);
    }
    public double volume(){
        return (double)(length*width*height);
    }
}