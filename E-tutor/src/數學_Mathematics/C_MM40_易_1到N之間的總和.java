package 數學_Mathematics;
import java.util.*;
public class C_MM40_易_1到N之間的總和 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int aimsNum=Integer.parseInt(sc.nextLine());
			int sum=0;
			for(int n=1;n<=aimsNum;n++) {
				sum+=n;
				System.out.print(n+(n==aimsNum?(" = "+sum+"\n"):" + "));
			}
		}
	}

}
