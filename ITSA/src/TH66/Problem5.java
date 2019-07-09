package TH66;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String a=sc.nextLine(); 
			String b=sc.nextLine();
			LinkedList<String> link = new LinkedList<String>();
			
				for(int n=0;n<a.length();n++) {
					for(int n2=n;n2<a.length();n2++) {
						for(int nb=0;nb<b.length();nb++) {
							for(int nb2=nb;nb2<b.length();nb2++) {
								if((n2-n)==(nb2-nb))
								{			
									if(a.substring(n, n2).equals(b.substring(nb, nb2))) {
										link.add(a.substring(n, n2));
									}
								}
							}
								
						}
					}
				}
				boolean test=false;
				for(int n=0;n<link.size();n++) {
					if(!link.get(n).equals("")) {
						test=true;
						break;
					}
				}
				if(test) {
					String master=link.get(0);
					int masternum=0;
					for(int n=1;n<link.size();n++) {
						if(link.get(n).length()>link.get(masternum).length()) {
							master=link.get(n);
							masternum=n;				
							
						}
					}
					if(master.length()>1) {
						System.out.println(master);
					}
					else {
						System.out.println("No common sequence!");
					}
				}
				else {
					System.out.println("No common sequence!");
				}
			
		}
		
		
		
		

	}

}
