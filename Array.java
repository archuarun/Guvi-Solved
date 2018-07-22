package ak;
import java.util.Scanner;
public class Array {
	public static void main(String...args){
	int a,b,i,sum=0;
	Scanner arun=new Scanner(System.in);
	a=arun.nextInt();
	b=arun.nextInt();
	int [] c=new int[a];
	for(i=0;i<a;i++){
		c[i]=arun.nextInt();
	}
	for(i=0;i<b;i++){
		sum=sum+c[i];
	}
		System.out.println(sum);
	arun.close();
	}
}