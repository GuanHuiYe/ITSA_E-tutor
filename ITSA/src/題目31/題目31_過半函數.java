package 題目31;
import java.util.Scanner;
public class 題目31_過半函數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String[] input=sc.nextLine().split(" ");
			int[] ans=new int[input.length];
			for(int n=0;n<input.length;n++) {
				for(int nn=0;nn<input.length;nn++) {
					if(input[n].equals(input[nn]))
						ans[n]++;
				}
				
			}
			Boolean test=false;
			int index=0;
			for(int n=0;n<input.length;n++) {
				
				if(ans[n]>input.length/2) {
					test=true;
					index=n;
					break;
				}
					
			}
			if(test) {
				System.out.println(input[index]);
			}
			else {
				System.out.println("NO");
			}
			
		}

	}

}
