 class circle
{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        double area=Math.PI*radius*radius;
        System.out.println("Area of the Circle: "+area);
    }
    public void perimeter()
    {
        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of the Circle: "+perimeter);
    }
}
 class rectangle
 {
     int length;
     int breath;
     rectangle(int length,int breath)
     {
         this.length=length;
         this.breath=breath;
     }
     public void area()
     {
         int area=length*breath;
         System.out.println("Area of the Rectangle: "+area);
     }
     public void perimeter()
     {
        int perimeter=2*(length+breath);
         System.out.println("Perimeter of the Rectangle: "+perimeter);
     }
 }

public class Geomentry {
    public static void main(String[]args)
    {
        circle c1=new circle(7);
        c1.area();
        c1.perimeter();
        rectangle r1=new rectangle(9,10);
        r1.area();
        r1.perimeter();
    }
}
