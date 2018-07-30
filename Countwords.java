package ak;
import java.util.Scanner;
public class Countwords{
	public static void main(String...args){
		String s;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		String[] s1=s.split(" ");
			int l=s1.length;
			arun.close();
		System.out.println(l);
	}

}
