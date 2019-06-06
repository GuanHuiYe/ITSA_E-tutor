package TH67;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] array=new int[7];
			int a=Integer.parseInt(sc.nextLine());
			int b=Integer.parseInt(sc.nextLine());
			int c=Integer.parseInt(sc.nextLine());
			int d=Integer.parseInt(sc.nextLine());
			array[a]++;
			array[b]++;
			array[c]++;
			array[d]++;
			boolean test=true;
			for(int n=1;n<array.length;n++) {
				if(array[n]==4) {
					System.out.println("WIN");
					test=false;
					break;
				}
				else if(array[n]==3){
					System.out.println("R");
					test=false;
					break;
				}				
			}
			if(!test) {
				continue;
			}
			else {
				int sum=0;
				for(int n=1;n<array.length;n++) {
					if(array[n]==1) {
						sum++;
					}								
				}
				if(sum==4) {
					System.out.println("R");
				}
				else {
					int index=1;	
					int sumindex=0;
					for(int n=1;n<array.length;n++) {
								if(array[n]==2) {						
									index=n;
									sumindex++;
								}
					}
					if(sumindex==1) {
						int sumans=0;
						for(int n=1;n<array.length;n++) {
							if(array[n]==1) {						
								sumans+=n;
							}
						}
						System.out.println(sumans);
					}
					else {
						System.out.println(index*2);
					}
					
				}
			}
			
		}
		
	}

}
