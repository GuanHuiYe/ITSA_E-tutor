package 數學_Mathematics;
import java.util.Scanner;

public class C_MM07_易_計算平方值與立方值 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		System.out.println(in+" "+Math.round(Math.pow(in, 2))+" "+Math.round(Math.pow(in, 3)));
	}

}
