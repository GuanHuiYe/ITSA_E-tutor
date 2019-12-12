package 數學II_MathematicsII;
import java.util.*;

public class C_MM057_易_老鼠問題 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			Integer mouse=Integer.parseInt(input[0]);
			Integer M=Integer.parseInt(input[1]);		
			LinkedList<Integer> Mouse_List=new LinkedList<Integer>();
			for(int n=0;n<mouse;n++) {
				Mouse_List.add(3);
			}
			for(int nth=0;nth<M;nth++) {
				int add_Count=(Mouse_List.size()/2)*3;
				while(--add_Count>=0) {
					Mouse_List.add(4);
				}
				LinkedList<Integer> Tmp_Mouse_List=new LinkedList<Integer>();
				for(int item:Mouse_List) {
					if(--item>0) {
						Tmp_Mouse_List.add(item);
					}
				}
				Mouse_List=Tmp_Mouse_List;			
			}
			System.out.println(mouse+" "+M+" "+Mouse_List.size());
		}
	}

}
