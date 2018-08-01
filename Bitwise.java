package ak;

import java.util.Scanner;

public class Bitwise {
	public static void main(String...args){
		int i,j;
		Scanner arun=new Scanner(System.in);
		i=arun.nextInt();
		j=arun.nextInt();
		i=i^j;
		j=i^j;
		i=i^j;
		System.out.println(i+" "+j);
	}

}
