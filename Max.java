package ak;
import java.util.Scanner;
public class Max {
	public static void main(String...args){
		int[] a=new int[10];
		int max=a[0];
		Scanner arun=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=arun.nextInt();
			if(a[i]>max){
				max=a[i];
			}
		}
			System.out.println(max);
		
	}

}
