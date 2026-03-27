// package sortedlist;
import java.util.*;

public class Sorted {
    public static void main(String[]args){
        List<Integer> list=Arrays.asList(12,23,34,45,56,67,78);
        List<Integer> result=list.stream().sorted((a,b)->a-b).limit(3).toList();
        System.out.println(result);

        //even sorted
         List<Integer> result2=list.stream().filter(a->a%2==0).sorted().toList();
        System.out.println(result2);

         //even sorted
        //  List<Integer> result3=list.stream().sorted((a,b)->a-b).skip(1).findFirst().get();
        // System.out.print(result3);

         //alphabeticaly sorted
         List<String> list2=Arrays.asList("ankit","nikhil","ankur");
         List<String> result4=list2.stream().sorted().toList();
        System.out.println(result4);

            //alphabeticaly sorted
         List<String> list3=Arrays.asList("ankit","nikhil","ankur");
         List<String> result5=list3.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(result5);

         List<String> list4=Arrays.asList("ankit","nikhil","ankur");
         List<Integer> result6=list4.stream().sorted((a,b)->a.length()-b.length()).toList();
        System.out.println(result6);


    }
    
}
