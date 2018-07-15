package ak;
import java.util.Scanner;
public class Largestno {
	public static void main(String...args){
	int a,b,c;
	System.out.println("enter the number");
	Scanner ak=new Scanner(System.in);
	a=ak.nextInt();
	b=ak.nextInt();
	c=ak.nextInt();
	if(a>=b&&a>=c){
			System.out.println(a);
		}
		if(b>=a&&b>=c){
			System.out.println(b);
		}
		if(c>=a&&c>=b){
			System.out.println(c);
		}
			ak.close();
	}
}

