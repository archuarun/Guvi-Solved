package ak;
import java.util.Scanner;
public class Word1{
	public static void main(String...args){
	String s;
	int a;
	Scanner arun=new Scanner(System.in);
	s=arun.next();
	a=arun.nextInt();
	for(int i=0;i<a;i++){
		System.out.println(s);
		arun.close();
	}
}
}