import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int a , b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c = a * (b%10);
		int d = a * ((b%100)/10);
		int e = a * ((b%1000)/100);
		
	
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a*b);
		
	}
}

