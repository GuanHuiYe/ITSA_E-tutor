package 數學_Mathematics;
import java.util.*;
public class C_MM19_易_電話費計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int im = Integer.parseInt(sc.nextLine());
			double ans=im*0.9;
			if(im>=1500) {
				ans*=0.79;
			}
			else if(im>800) {
				ans*=0.9;
			}			
			System.out.printf("%.1f\n",ans) ;
		}
		
		
	}

}
