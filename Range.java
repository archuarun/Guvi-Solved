package ak;

import java.util.Scanner;

public class Range {
	public static void main(String...args){
		int i;
		Scanner arun=new Scanner(System.in);
		i=arun.nextInt();
		if(i>=1&&i<=10){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
