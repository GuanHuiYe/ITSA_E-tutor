package �ƾ�_Mathematics;
import java.util.*;
public class C_MM40_��_1��N�������`�M {

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
