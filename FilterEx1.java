import java.util.*;
import java.util.stream.*;
public class FilterEx1{
    public static void main(String[]args){
        // List list=Arrays.asList(10,15,20,25,55,58,60,30,11,17,16);
        List list=Arrays.asList("Amit","Ravi",null,"Anil","Vikas","Ashok");
        ArrayList<String> value=new ArrayList<>();
        value.addAll(list);
        // Example 1
        // value.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

        // Example 2 Print name with A
        // value.stream().filter(n->n.charAt(0)=='A').forEach(System.out::println);
        // value.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
        
        // Example 3
        // value.stream().filter(n->n>=50&&n<=60).forEach(System.out::println);
        
        // Example 4
        // value.stream().filter(n->n.length()>4).forEach(System.out::println);
        
        // Example 5
        // value.stream().filter(n->n!=null).forEach(System.out::println);

        


        }
}