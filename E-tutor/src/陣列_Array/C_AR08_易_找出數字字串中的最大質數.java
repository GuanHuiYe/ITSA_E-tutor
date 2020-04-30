package 陣列_Array;
import java.util.*;
public class C_AR08_易_找出數字字串中的最大質數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int s=0;s<input.length();s++) {
			for(int e=s+1;e<input.length()+1;e++) {
				al.add(Integer.parseInt(input.substring(s,e)));
			}
		}
		int ans=0;
		for(int item:al) {
			if(is_prime(item)&&item>ans)ans=item;				
		}
		System.out.println(ans==0?"No prime found":ans);
	}
	public static Boolean is_prime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int nth = 3; nth < Math.sqrt(n); nth++) {
			if (n % nth == 0)
				return false;

		}
		return true;

	}

}
