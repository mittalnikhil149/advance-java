public package lambda;
import java.util.*;

@FunctionalInterface
interface Square{
	int getSquare(int n);
}

@FunctionalInterface
interface Palindrome{
	boolean isPlaindrome(String str);
}


public class LambdaPractice {

	public static void main(String[] args) {
		Runnable r = ()-> System.out.println("Thread is running");
		Thread t = new Thread(r);
		t.start();
		
		Comparator<Integer> comp = (Integer a, Integer b)-> a*b;
		System.out.println(comp.compare(50, 10));
		
		Square s = (n)-> n*n;
		System.out.println(s.getSquare(5));
		
		Palindrome p = (String str)->{
			String reversed = new StringBuilder(str).reverse().toString();
			if(str.equals(reversed)) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(p.isPlaindrome("madam") ? "This is palindrome" : "This is not a palindrom" );
		
	}

}
