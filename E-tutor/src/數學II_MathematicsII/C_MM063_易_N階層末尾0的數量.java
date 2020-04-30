package 數學II_MathematicsII;
import java.util.*;

public class C_MM063_易_N階層末尾0的數量 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());

		System.out.println(fact_tail_zero(m,5));

	}

	public static int fact_tail_zero(int n,int x) {
		int ret = 0;
		if(n/x==0) {
			return 0;
		}
		ret=n/x;
		return ret+fact_tail_zero(n,x*5);
	}

}
