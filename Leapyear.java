package ak;
import java.util.Scanner;
public class Leapyear {
	public static void main(String...args){
		int i;
		Scanner arun=new Scanner(System.in);
		i=arun.nextInt();
		if((i%400==0)||i%4==0&&i!=0){
			System.out.println("Leap Year");
		}
			else{
				System.out.println("Not leap Year");
			}
		arun.close();
		}
}
	
	


