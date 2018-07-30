package ak;
import java.util.Scanner;
public class Ns {
	public static void main(String...args){
		String s;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		String s1=s.replaceAll("[^0-9]","");
		System.out.println(s1);
		
	}

}
