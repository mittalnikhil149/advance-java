import java.util.*;
// class employee{
//     String name;
//     employee(String name){
//     this.name=name;
//     }
// }


// public class DemoStream {
//     public static void main(String[] args) {
//     List<employee> list=Arrays.asList(
//         new employee ("ankur"),
//         new employee("anuj")
        
//     );
//     List<String> result=list.stream().map(emp->emp.name).toList();
//     System.out.println(result);
//     }}

public class DemoStream {
    public static void main(String[] args) {
    List<String> list=Arrays.asList("nikhil","anuj");
    List<String> upper=list.stream().map(x->x.toUpperCase()).toList(); 
    System.out.println(upper);   
    
    System.out.println();

    List<Integer> list1=Arrays.asList(1,2,3,4);
    List <Integer> Squire=list1.stream().map(x->x*x).toList();
    System.out.println(Squire);

    List<String> list2=Arrays.asList("java","python","c++");
    List<Character> single=list2.stream().map(x->x.charAt(0)).toList();
    System.out.println(single);

    System.out.println();

    List<Integer> list3=Arrays.asList(1,23,3,2,5);
    List<String> con=list3.stream().map(String::valueOf).toList();
    System.out.println(con);

    System.out.println();

    List<String> list4=Arrays.asList("A","B","c","D");
    List<String> Item=list4.stream().map(x->"item-"+x).toList();
    Item.forEach(System.out::println);

    System.out.println();

    List<String> list5=Arrays.asList("java","python","c++");
    List<Integer> len=list5.stream().map(x->x.length()).toList();
    System.out.println(len);
    
    System.out.println();

    List<Integer> list6=Arrays.asList(5,10,15);
    List<Integer> result=list6.stream().map(x->x*2).toList();
    System.out.println(result);
 
    System.out.println();

    List<String> list7=Arrays.asList("5","10","15");
    List<Integer> result7=list7.stream().map(Integer::parseInt).toList();
    System.out.println(result7);

    System.out.println();

    List<String> list8=Arrays.asList("python","java  ","  c++");
    List<String> result8=list8.stream().map(String::trim).toList();
    System.out.println(result8);
    
    System.out.println();

    List<String> list9=Arrays.asList("java","python","c++");
    List<Character> result9=list9.stream().map(x->x.charAt(x.length()-1)).toList();
    System.out.println(result9);
    
    System.out.println();

    List<String> list10=Arrays.asList("java","python","c++");
    List<Integer> result10=list10.stream().map(String::hashCode).toList();
    System.out.println(result10);
    }    
}
