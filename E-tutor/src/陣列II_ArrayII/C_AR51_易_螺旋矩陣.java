package 陣列II_ArrayII;

import java.util.Scanner;

public class C_AR51_易_螺旋矩陣 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		String[] in=sc.nextLine().split(",");
		int[][] ans=new int[Integer.parseInt(in[0])][Integer.parseInt(in[0])];
		
		for(int n=0;n<ans.length;n++) {
			for(int n1=0;n1<ans[n].length;n1++) {
				ans[n][n1]=0;
			}
		}
		
		int range=Integer.parseInt(in[0])-1;
		
		if(Integer.parseInt(in[1])==2) {
			int n=1;
			int x=0,y=0;
			int ctrl=0;
			while(true) {
				
				ans[x][y]=n;
				if(x>0&&x<range&&y>0&&y<range) {
					if(ans[x+1][y]!=0&&ans[x-1][y]!=0&&ans[x][y+1]!=0&&ans[x][y-1]!=0) {
						break;
					}
				}
				if(ctrl==0) {
					if(x<range) {	
						if(ans[x+1][y]==0) {
							x++;
							
						}
						else {
							ctrl=1;	
							y++;
						}
																			
					}
					else {
						ctrl=1;	
						y++;
					}	
					
				}
				else if(ctrl==1) {
					if(y<range) {
						if(ans[x][y+1]==0) {
						y++;
						}
						else {
							ctrl=2;
							x--;
						}
					}
					else {
						ctrl=2;
						x--;
					}
				}
				else if(ctrl==2) {
					if(x>0) {
						
						if(ans[x-1][y]==0) {
							x--;
						}
						else {
							ctrl=3;
							y--;
						}
						
					}
					else {
						ctrl=3;
						y--;
					}
				}
				else if(ctrl==3) {
					if(y>=0) {
						if(ans[x][y-1]==0) {
							y--;
						}
						else {
							ctrl=0;
							x++;
						}
					}
					else {
						ctrl=0;
						x++;
					}
				}
				
				n++;
				
				
			}
		}
		else if(Integer.parseInt(in[1])==1){
			int n=1;
			int x=0,y=0;
			int ctrl=1;
			while(true) {
				
				ans[x][y]=n;
				if(x>0&&x<range&&y>0&&y<range) {
					if(ans[x+1][y]!=0&&ans[x-1][y]!=0&&ans[x][y+1]!=0&&ans[x][y-1]!=0) {
						break;
					}
				}
				if(ctrl==0) {
					if(x<range) {	
						if(ans[x+1][y]==0) {
							x++;
							
						}
						else {
							ctrl=3;	
							y--;
						}
																			
					}
					else {
						ctrl=3;	
						y--;
					}	
					
				}
				else if(ctrl==1) {
					if(y<range) {
						if(ans[x][y+1]==0) {
						y++;
						}
						else {
							ctrl=0;
							x++;
						}
					}
					else {
						ctrl=0;
						x++;
					}
				}
				else if(ctrl==2) {
					if(x>0) {
						
						if(ans[x-1][y]==0) {
							x--;
						}
						else {
							ctrl=1;
							y++;
						}
						
					}
					else {
						ctrl=3;
						y++;
					}
				}
				else if(ctrl==3) {
					if(y>0) {
						if(ans[x][y-1]==0) {
							y--;
						}
						else {
							ctrl=2;
							x--;
						}
					}
					else {
						ctrl=2;
						x--;
					}
				}
				
				n++;
				
				
			}
		}
		
		
		for(int n=0;n<ans.length;n++) {
			for(int n1=0;n1<ans[n].length;n1++) {
				System.out.printf("%03d", ans[n][n1]);
				if(n1 == ans.length-1) {
					System.out.print("\n");
				}
				else {
					System.out.print(",");
				}
			}
		}
	}


}
