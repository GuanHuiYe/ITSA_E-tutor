package TH72;

import java.util.*;

public class Problem_1_½è¼Æ§P§O {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			if (PrimeNumber(Integer.parseInt(sc.nextLine())))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	
	}

	public static Boolean PrimeNumber(int N) {
		 if (N <= 1) return false;
         else if (N == 2) return true;
         else if (N % 2 == 0) return false;
         else
         {
             for (int i = 3; i <= (int)Math.sqrt((double)N); i = i + 2)
             {
                 if (N % i == 0) return false;
             }
             return true;
         }
	}

}
