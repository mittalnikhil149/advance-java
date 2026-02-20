package calc;

class sum{
    int num1,num2;
    sum(){          //user define default constructor
        this(10,10);

    }
    sum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        
    }
    void getSum(){
        System.out.println("sum ="+(num1+num2));
    }
}
public class Calculator{
    public static void main(String[]args){
        sum s;   //object decleration
        s=new sum();    //object instantiation
        s.getSum();
        // sum s2;
        // s2.getSum();
        // new sum(15,15).getSum(); //object creation without reference variable
        
    }
}