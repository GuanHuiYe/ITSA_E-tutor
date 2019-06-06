package TH67;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int num=sc.nextInt(),tot=0,i=1;
			while(true){
				tot+=i;
				if(tot>num)
					break;
				i++;
			}
			System.out.println(i-1);
		}
	}

}
