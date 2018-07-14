package ak;
import java.util.Scanner;
public class Vowels {
	public static void main(String...args){
		char ch;
		Scanner arun=new Scanner(System.in);
		ch=arun.next().charAt(0);
		if(ch>=23&&ch<=64){
			System.out.println("invalid");
		}
		else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				System.out.println("vowels");
		}
			else{
				System.out.println("Consonant");
			}
		arun.close();
	}
	}
