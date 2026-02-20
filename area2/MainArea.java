package area2;

abstract class Area{
    int r,b,l;
   abstract void getArea(int r,int b,int l);
    
}
class Reactangle extends Area{
    int l,b;
    
    Reactangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    void getArea(int r,int b,int l){
        r=l*b;
        System.out.println("area of reactangle "+r);
    }
    void displayresult(){
        System.out.println("area of rectangle");
    }

}

public class MainArea {
    public static void main(String[] args) {
        Reactangle r = new Reactangle(24,7);
        r.displayresult();
        
    }
    
}
