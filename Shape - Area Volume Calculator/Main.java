import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double base,height,radius,width,length;
        Shape[] arr = new Shape[5];
        String str = new String();
        
            for(int i=0; i<5;i++){
                str = in.next();
            switch(str){
            case "Triangle":
                Triangle triangle = new Triangle();
                base=in.nextDouble();
                height=in.nextDouble();
                triangle.setBase(base);
                triangle.setHeight(height);
                arr[0]=triangle;
                System.out.println("Area "+arr[0].area());
                break;
                
            case "Sphere":
                Sphere sphere = new Sphere();
                radius=in.nextDouble();
                sphere.setRadius(radius);
                arr[1]=sphere;
                System.out.println("Area "+arr[1].area());
                if(arr[1] instanceof Spatial && (arr[1] instanceof Sphere || arr[1] instanceof Cube)){
                    System.out.println("Volume "+arr[1].volume());
                }
                break;
                
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                length=in.nextDouble();
                width = in.nextDouble();
                rectangle.setLength(length);
                rectangle.setWidth(width);
                arr[2]=rectangle;
                System.out.println("Area "+arr[2].area());
                break;
                
             case "Cube":
                Cube cube = new Cube();
                length=in.nextDouble();
                width = in.nextDouble();
                height=in.nextDouble();
                cube.setLength(length);
                cube.setWidth(width);
                cube.setHeight(height);
                arr[3]=cube;
                System.out.println("Area "+arr[3].area());
                if(arr[3] instanceof Spatial && (arr[3] instanceof Sphere || arr[3] instanceof Cube)){
                    System.out.println("Volume"+arr[3].volume());
                }
                break;
                default:
                break;
            }
        }
    }
}