package �ƾ�_Mathematics;
import java.util.*;
public class C_MM42_��_�D�M {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int aimsNum=Integer.parseInt(sc.nextLine());
			Double sum=0.0;
			for(int n=1;n<=aimsNum;n++) {
				sum+=Math.pow(-1, n+1)*1/(2*n-1);				
			}
			System.out.printf("%.3f\n", sum);			
		}
	}

}
