package 數學_Mathematics;
import java.util.*;
public class C_MM36_易_季節判定 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int month=Integer.parseInt(sc.nextLine());
			if(month<=2||month==12)
				System.out.println("Winter");
			else if(month<=5) 
				System.out.println("Spring");
			else if(month<=8) 
				System.out.println("Summer");
			else 
				System.out.println("Autumn");
		}
	}

}
