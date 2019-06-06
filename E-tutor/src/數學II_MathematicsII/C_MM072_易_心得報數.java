package 數學II_MathematicsII;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class C_MM072_易_心得報數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int n=Integer.parseInt(sc.nextLine());n>0;n--) {
			Queue<Integer> qu =new LinkedList<>();
			int max=Integer.parseInt(sc.nextLine());
			for(int i=0;i<max;i++) {
				qu.offer(i+1);
			}
			int no=Integer.parseInt(sc.nextLine());
			int nn=0;
			while(qu.size()>1) {
				nn++;
				if(nn==no) {
					qu.poll();
					nn=0;
					continue;
				}				
				qu.offer(qu.poll());
			}
			
			System.out.println(qu.poll());
		}
	}

}
