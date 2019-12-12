package _2019_12;
import java.util.*;

public class Problem4_§ä¹s¿ú {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			int money=Integer.parseInt(sc.nextLine());
		    while(money>1000) {
		    	money-=1000;
		    }
		    money=1000-money;
		    int m500=0,m100=0,m50=0,m10=0,m5=0,m1=0;
		    m500 = money / 500;
			money %= 500;
		    m100 = money / 100;
			money %= 100;
		    m50 = money / 50;
			money %= 50;
			m10 = money / 10;
			money %= 10;
			m5 = money / 5;
			money %= 5;
			m1 = money;
			System.out.println(m50+m10+m5+m1);
			System.out.println(m500+" "+m100+" "+m50+" "+m10+" "+m5+" "+m1);
		}
	}

}
