package 數學_Mathematics;
import java.math.BigInteger;
import java.util.*;
public class C_MM49_易_連續1的倍數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		for (String item : input) {
			System.out.println(multiple(Long.parseLong(item)));
		}
	}
	
	public static int multiple(long n) {
		BigInteger aims=BigInteger.ONE;
		int count=1;
		while(true) {
				if(aims.mod(BigInteger.valueOf(n))==BigInteger.ZERO)return count;
				else aims=(aims.multiply(BigInteger.TEN)).add(BigInteger.ONE);
				count++;
		}
	}

}
