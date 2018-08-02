package ak;
import java.util.Scanner;
public class Compare {
	public static void main(String...args){
		String s,s1;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		s1=arun.nextLine();
		int l=s.length();
		int l1=s1.length();
		if(l==l1){
			System.out.println(s);
		}
		else if(l<l1){
			System.out.println(s1);
		}else{
			System.out.println(s);
		}
	}
}
