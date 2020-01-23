public class Sphere extends Shape implements Spatial
{
    private double radius;
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
     public double area(){
         return (double)(4*Math.PI*radius*radius);
     }
     public double volume(){
         return (double)((4*Math.PI*radius*radius*radius)/3);
     }
    
}