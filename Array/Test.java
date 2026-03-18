// import java.util.*;

// public class ArrayUser {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++) {
//         System.out.println(arr[i]);
//     }}
// }

interface A{

    default void show(){
        System.out.println("Default Method");
    }
}

class Test implements A{

    public static void main(String[] args){

        Test t = new Test();
        t.show();
    }
}