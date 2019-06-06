package TH65;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] in=sc.nextLine().split(" ");
			
			Queue<Integer> qu =new LinkedList<Integer>();
			int max=Integer.parseInt(in[0]);
			for(int i=0;i<max;i++) {
				qu.offer(i+1);
			}
			
			
			int no=Integer.parseInt(in[2]);
			int nn=1;
			
			for(int n=0;n<Integer.parseInt(in[1]);n++) {;
			qu.offer(qu.poll());
		    }
			while(qu.size()>1) {
				nn++;
				if(nn==no) {				
					System.out.print(qu.poll()+" ");
					nn=0;
					continue;
				}				
				qu.offer(qu.poll());
			}
			
			System.out.println(qu.poll());
		}
		

	}

}
