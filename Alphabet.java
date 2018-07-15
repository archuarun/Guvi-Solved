package ak;
import java.util.Scanner;
public class Alphabet {
	public static void main(String...args){
		char ch;
		Scanner arun=new Scanner(System.in);
		ch=arun.next().charAt(0);
		if(ch>=65&&ch<=90||ch>=97&&ch<=122){
			System.out.println("Alphabets");
		}
		else{
			System.out.println("No");
	}
	}
}
