package ak;
import java.util.Scanner;
public class Even {
	public static void main(String...args){
		int i;
		Scanner arun=new Scanner (System.in);
		i=arun.nextInt();
		if(i<=0){
			System.out.println("invalid");
		}
		else if(i%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		arun.close();
		}
	}
}
