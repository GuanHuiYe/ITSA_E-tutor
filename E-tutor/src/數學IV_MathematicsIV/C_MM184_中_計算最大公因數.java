package 數學IV_MathematicsIV;
import java.util.*;

public class C_MM184_中_計算最大公因數 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
while(true) {
	String[] input=sc.nextLine().split(" ");
	if(input[0].equals("0")&&input[1].equals("0"))break;
	System.out.println(gcd(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
}

	}
	public static int gcd(int m, int n) {
		if (n == 0)
			return m;
		else
			return gcd(n, m % n);
	}
}
