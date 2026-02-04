package calc;

class sum{
    int num1,num2;
    void getSum(){
        System.out.println("sum ="+(num1+num2));
    }
}
public class Calculator{
    public static void main(String[]args){
        sum s=new sum();
        s.getSum();
        
    }
}