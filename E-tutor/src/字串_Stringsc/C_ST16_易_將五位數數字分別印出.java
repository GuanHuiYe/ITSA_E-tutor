package �r��_Stringsc;
import java.util.*;

public class C_ST16_��_�N����ƼƦr���O�L�X {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			char[] input=sc.nextLine().toCharArray();
			for(int index=0;index<input.length;index++) {
				System.out.print(input[index]+(index==input.length-1?"\n":"   "));
			}
		}

	}

}
