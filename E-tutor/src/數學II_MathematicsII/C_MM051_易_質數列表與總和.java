package 數學II_MathematicsII;
import java.util.*;

public class C_MM051_易_質數列表與總和 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> al=new ArrayList<Long>();
		int need=Integer.parseInt(sc.nextLine());
		int sum=0;
		long num=2;
		while(al.size()<need) {
				if(is_prime(num)) {
					al.add(num);
					sum+=num;					
				}
				num++;
		}
		for(int index=0;index<al.size();index++) {
			System.out.print(al.get(index)+",");
		}
		System.out.println("\n"+sum);

	}
	
	public static Boolean is_prime(long n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (long nth = 3; nth <= Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;
		}
		return true;

	}

}
