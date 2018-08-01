package ak;
import java.util.Scanner;
public class Swap {
	public static void main(String...args){
		int i,j;
		Scanner arun=new Scanner(System.in);
		i=arun.nextInt();
		j=arun.nextInt();
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		arun.close();
		System.out.print(i+" "+j);
		
		
		
	}

}
