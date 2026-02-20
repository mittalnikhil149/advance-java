package poly;

class Animal{
    String name;
    String sound;
    void makesound(){

        System.out.println("this is animal class ");
    }
}
class Cat extends Animal{
    int leg;
    Cat(String name,String sound,int leg){
        super.name=name;
        super.sound=sound;
        this.leg=leg;
     
    }
       @Override
         void makesound(){

        System.out.println("this is animal class ");x
    }

}

public class MainPoly {
    public static void main(String[] args) {
    }
    
}
