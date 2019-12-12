package 數學IV_MathematicsIV;
import java.util.*;
public class C_MM155_易_判定質數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(is_prime(Integer.parseInt(sc.nextLine()))?"yes":"no");
		}

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
