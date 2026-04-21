import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[]args){
    List<Integer> list=Arrays.asList(10, 15, 20, 25, 30,11,17,16);
    List<Integer> result=list.stream().filter(x->x%2==0).toList();
    System.out.println(result);

    System.out.println();

    List<String> list2=Arrays.asList("Anuj","Nikhil","Ankit","Mudassar");
    List<String> result2=list2.stream().filter(x->x.startsWith("A")).toList();
    result2.forEach(System.out::println);

    List<Integer> list3=Arrays.asList(10, 60, 45, 90, 30, 24, 50,52,54,55,59, 76);
    List<Integer> result3=list3.stream().filter(x->x>=50&&x<=60).toList();
    System.out.println(result3);

    List<String> list4=Arrays.asList("Java", "Python", "C", "React", "C#", "Next.js", "Node.js");
    List<String> result4=list4.stream().filter(x->x.length()>4).toList();
    result4.forEach(System.out::println);

    System.out.println();

    List<String> list5=Arrays.asList("Java", null, "Spring", null, "React");
    List<String> result5=list5.stream().filter(x->x!=null).toList();
    result5.forEach(System.out::println);

    List<Integer> list6=Arrays.asList(10, 12, 15, 22, 25, 36, 75);
    list6.stream().filter(x->x%5==0).toList().forEach(System.out::println);
    
    System.out.println();

    List<String> list7=Arrays.asList("Java", "", "Spring", "", "AI");
    list7.stream().filter(x->x!="").toList().forEach(System.out::println);
    }
}
