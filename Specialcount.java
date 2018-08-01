package ak;
import java.util.Scanner;
public class Specialcount{
	public static void main(String...args){
	String s;
	Scanner arun=new Scanner(System.in);
	s=arun.nextLine();
	String s1=s.replaceAll("[a-zA-Z]","");
	arun.close();
	System.out.println(s1.length());
	}
}
