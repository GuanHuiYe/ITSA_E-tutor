package �r��_Stringsc;
import java.util.*;

public class C_ST17_��_�P�_�O�_���j�� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			char[] input=sc.nextLine().toCharArray();
			Boolean test=true;
			for(int index=0;index<input.length/2;index++) {
			if(input[index]!=input[input.length-1-index])	
				test=false;
			}
			System.out.println(test?"YES":"NO");
		}

	}

}
