package ak;
import java.util.Scanner;
public class Guvicount {
	public static void main(String...args){
	String s;
	Scanner arun=new Scanner(System.in);
	s=arun.nextLine().replaceAll(" ","");
	int i=s.length();
	arun.close();
	System.out.println(i);
	}

}
