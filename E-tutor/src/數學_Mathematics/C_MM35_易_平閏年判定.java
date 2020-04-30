package 數學_Mathematics;
import java.util.*;
public class C_MM35_易_平閏年判定 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int year=Integer.parseInt(sc.nextLine());
			Boolean test=false;
			if(year%4==0) {
				if(year%100!=0)
					test=true;
				else if(year%400==0) 
					test=true;
			}
			
			System.out.println(test?"Bissextile Year":"Common Year");
		}
	}

}
