package �ƾ�_Mathematics;
import java.util.*;
public class C_MM28_��_�p��1��N�����ݩ�5�M7������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end=Integer.parseInt(sc.nextLine());
		String ans="";
		for(int n=1;n<end;n++) {
			if(n%5==0&&n%7==0) {
				ans+=n+" ";
			}
		}
		System.out.println(ans.substring(0, ans.length()-1));
	}
}
