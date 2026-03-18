import java.util.*;
import java.util.function.Consumer;
public class MainForeach {
    public static void main(String[] args) {
        int[] arr =new int [] {1, 2, 3, 4, 5};
       List<Integer> list = new ArrayList<>(arr.length);
       for(int i:arr){
           list.add(i);
       }
       System.out.println(list);
        }
    }
