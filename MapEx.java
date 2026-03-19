import java.util.*;

public class MapEx {
    public static void main(String[]args){
        // List marks=Arrays.asList(10,30,40,20,50,60,70);
        List marks=Arrays.asList("sachin","rahul","amit");

            // ArrayList<Integer> list=new ArrayList<>();
            ArrayList<String> list=new ArrayList<>();
            list.addAll(marks);
            System.out.print(list);

            // Example add 5 num Grace
            // List<Integer> grace=list.stream().filter(n->n<40).map(n->n+5).toList();

            // 1. Example Uppercase
            List<String> grace=list.stream().map(n->n.toUpperCase()).toList();
            System.out.println(grace);
    }
}
