package �r��II_StringsII;
import java.util.*;

public class C_ST63_��_�M���r���������r���ƶq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			String input=sc.nextLine();
			int count=0;
			for(char item:input.toLowerCase().toCharArray()) {
				if(item=='a'||item=='e'||item=='i'||item=='o'||item=='u') 
					count++;				
			}
			System.out.println(input+" "+count);
		}

	}

}
