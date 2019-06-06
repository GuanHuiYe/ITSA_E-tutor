package 數學_Mathematics;
import java.util.Scanner;

public class C_MM17_易_求最大公因數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] in=sc.nextLine().split(" ");
		int a=Integer.parseInt(in[0]),b=Integer.parseInt(in[1]);
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;			
		}
		System.out.println(a);
	}

}
