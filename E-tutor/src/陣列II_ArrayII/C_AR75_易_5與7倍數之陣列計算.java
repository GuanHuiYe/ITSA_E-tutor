package 陣列II_ArrayII;

import java.util.*;

public class C_AR75_易_5與7倍數之陣列計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Integer> TM = new TreeMap<Integer, Integer>();
		TM.put(0, 5);
		TM.put(1, 7);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int num = Integer.parseInt(sc.nextLine());
			
			if (!TM.containsKey(num)) {
				int n = TM.get(TM.lastKey()) + 1;
				while (true) {
					if (n % 5 == 0 || n % 7 == 0)
						TM.put(TM.lastKey() + 1, n);
					if(n>=1000000)break;
					n++;
				}
			}
			
			int ans1=0;
			double ans2=0;
			double count=0;
			for(Map.Entry<Integer,Integer>item:TM.entrySet() ) {
				if(item.getKey()%2==0) {
					ans1+=item.getValue();
					
				}
				else {
					ans2+=item.getValue();
					count++;
				}
				if(item.getValue()>=num) {
					break;
				}
			}	
			System.out.printf("%d\n%.1f\n",ans1,ans2/count);
			
		}
	}

}
