package 陣列_Array;

import java.util.*;

public class C_AR10_中_新通話費率 {

	public static class CallRate {
		public Double rate;
		public Double one_discount;
		public Double two_discount;

		public CallRate(Double rate, Double one_discount, Double two_discount) {
			this.rate = rate;
			this.one_discount = one_discount;
			this.two_discount = two_discount;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input=sc.nextLine();
		int a=Integer.parseInt(input.substring(0,input.indexOf(",")));
		int b=Integer.parseInt(input.substring(input.indexOf(" ")+1,input.length()));
		CallRate rate = null;
		switch(a) {
		case 186:
			rate=new CallRate(0.09,0.9,0.8);
			break;
		case 386:
			rate=new CallRate(0.08,0.8,0.7);
			break;
		case 586:
			rate=new CallRate(0.07,0.7,0.6);
			break;
		case 986:
			rate=new CallRate(0.06,0.6,0.5);
			break;
		}
		long ans=Math.round(b*rate.rate);		
		System.out.println(Math.round(ans*(ans/a<2?rate.one_discount:rate.two_discount)));
	}

}
