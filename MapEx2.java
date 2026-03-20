
import java.util.*;
import java.util.stream.*;

public class MapEx2 {
   public static void main(String[]args){
        List marks=Arrays.asList(10,30,40,20,50,60,70);

            ArrayList<Integer> list=new ArrayList<>();
            list.addAll(marks);
            
            System.out.print(list);

        List<Boolean> hashCodes = list.stream().map(s->s%2==0).collect(Collectors.toList());

        System.out.println(hashCodes);
    }
}
