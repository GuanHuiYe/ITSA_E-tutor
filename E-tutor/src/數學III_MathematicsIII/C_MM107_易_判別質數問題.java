package �ƾ�III_MathematicsIII;
import java.util.*;

public class C_MM107_��_�P�O��ư��D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());		
		System.out.println(num+" is"+(!is_prime(num)?" not":"")+" a prime number.");
	}
	public static Boolean is_prime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int nth = 3; nth <= Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;

		}
		return true;

	}

}
