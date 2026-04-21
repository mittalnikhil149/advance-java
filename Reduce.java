import java.util.*;
public class Reduce{
    public static void main(String[] args) {
    List<Integer> list=Arrays.asList(1,2,3,4,5);
    int sum=list.stream().reduce(1,(a,b)->a*b);
    System.out.println(sum);

    List<Integer> list2=Arrays.asList(12, 45, 7, 89, 23, 56);
    int max=list2.stream().reduce());
    }
}