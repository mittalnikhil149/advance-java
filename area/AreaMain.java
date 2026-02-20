package area;
abstract class Area{     //abstract class a incomplete class
    int r,l,b;
    Area(String msg){
        System.out.println("this is a constructor");
    }
    void getArea(){
        System.out.println("this is area class ");
    }
}
class Circle extends Area{
    final double pi=3.14;
    Circle(int r){
        super("this is area constructor");
        this.r=r;
    }
    void getCircleArea(){
     double result=pi*r*r;
     System.out.println("area of circle "+result);
    }
}

public class AreaMain {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.getArea();
        c.getCircleArea();
    //   Circle s=(Circle)new Area("5");
    }
    
}
