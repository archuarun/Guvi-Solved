package ak;
import java.util.Scanner;
public class Count {
	public static void main(String...args){
		int i,j;
		Scanner arun=new Scanner(System.in);
		i=arun.nextInt();
		String s=String.valueOf(i);
		j=s.length();
		System.out.println(j);
	arun.close();
	}
}
