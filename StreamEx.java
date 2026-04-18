import java.util.*;
import java.util.stream.*;
public class StreamEx{
    public static void main(String args[]){
        List<Integer> list=Arrays.asList(12,23,34,45);
        List<Integer> Result=list.stream().map(x -> x * 2).collect(Collectors.toList());
        Result.forEach(System.out::println);

        System.out.println();

          List<Integer> list2=Arrays.asList(12,23,34,45);
        List<Integer> result=list2.stream().map(x -> x * 2).filter(x -> x < 50).collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println();

        List<String> list3=Arrays.asList("java","python","c++","ruby");
        List<String> uppercase=list3.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        uppercase.forEach(System.out::println);
    }
}