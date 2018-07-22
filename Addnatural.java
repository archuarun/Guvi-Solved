package ak;
import java.util.Scanner;
public class Addnatural {
	public static void main(String...args){
		int a,i,sum=0;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		for(i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
arun.close();
}
}