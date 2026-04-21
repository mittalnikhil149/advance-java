import java.util.*;
import java.util.stream.*;

// class Employee {
//     String name;
//     Employee(String name) { this.name = name; }
// }


public class StreamEx {

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(12, 23, 34, 45);
        List<Integer> Result = list.stream().map(x -> x * 2).collect(Collectors.toList());
        Result.forEach(System.out::println);

        System.out.println();

        List<Integer> list2 = Arrays.asList(12, 23, 34, 45);
        List<Integer> result = list2.stream().map(x -> x * 2).filter(x -> x < 50).collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println();

        List<String> list3 = Arrays.asList("java", "python", "c++", "ruby");
        List<String> uppercase = list3.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        uppercase.forEach(System.out::println);

        System.out.println();

        List<String> list4 = Arrays.asList("java", "python", "c++", "ruby");
        List<Character> out = list4.stream().map(x -> x.charAt(0)).collect(Collectors.toList());
        out.forEach(System.out::println);

        System.out.println();

        List<Integer> list5 = Arrays.asList(12, 23, 34, 45);
        List<String> intTOstring = list5.stream().map(String::valueOf).collect(Collectors.toList());
        intTOstring.forEach(System.out::println);

        System.out.println();

        List<String> list6 = Arrays.asList("j", "p", "c", "r");
        List<String> item = list6.stream().map(x -> "item-" + x).collect(Collectors.toList());
        item.forEach(System.out::println);

        System.out.println();

        List<String> list7 = Arrays.asList("java", "python", "c++", "ruby");
        List<Integer> len = list7.stream().map(String::length).toList();
        len.forEach(System.out::println);

        System.out.println();

        // List<Employee> list = Arrays.asList(new Employee("Amit"),new Employee("Rahul"));
        // List<String> result = list.stream().map(emp -> emp.name).toList();
        // System.out.println(result);
        
        System.out.println();

        List<Integer> list9 = Arrays.asList(12,23,34,45);
        List<Integer> Double = list9.stream().map(n->n*2).toList();
       Double.forEach(System.out::println);

       System.out.println();

        List<String> list10 = Arrays.asList("1", "2", "3", "4");
        List<Integer> coninte = list10.stream().map(Integer::parseInt).toList();
        coninte.forEach(System.out::println);
        
       System.out.println();

        List<String> list11 = Arrays.asList("anuj", "  Nikhil", "mudassar", "rijul","prashant");
        List<String> treem = list11.stream().map(String::trim).toList();
        treem.forEach(System.out::println);
         
        System.out.println();

    List<Double> list12 = Arrays.asList(1.1,2.4,5.6);
    List<Double> doubleList = list12.stream().map(x->(x*9/5)+32).toList();
    doubleList.forEach(System.out::println);
     
       System.out.println();

        List<String> list13 = Arrays.asList("anuj", "  Nikhil", "mudassar", "rijul","prashant");
        List<Character> lastchar = list13.stream().map(x -> x.charAt(x.length() - 1)).toList();
        lastchar.forEach(System.out::println);

        System.out.println();

            List <Integer> list14=Arrays.asList(12,3,5);
            List<Integer> add=list14.stream().map(x->x).toList();
            System.out.println(add);
    }
}
