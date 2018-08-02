package ak;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String...args){
		int a=1,b=1,c=1,d;
		Scanner arun=new Scanner(System.in);
		d=arun.nextInt();
		for(int i=0;i<d;i++){
			a=b;
			b=c;
			c=a+b;
		System.out.println(a);
		}
	}

}
