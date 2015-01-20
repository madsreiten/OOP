package Oving0;

import java.util.Scanner;

public class Rects {
	
	double r1x1 = 0;
	double r1y1 = 0;
	double r1x2 = 1;
	double r1y2 = 1;
	
	double r2x1 = 2;
	double r2y1 = 2;
	double r2x2 = 3;
	double r2y2 = 3;
	float val;
	int pos;
	private Scanner scanner;
	
		public void main(){
			scanner = new Scanner(System.in);
			while(true){
			System.out.println("Rect1: " + rectangle2String(r1x1, r1y1, r1x2, r1y2));
			System.out.println("Rect2: " + rectangle2String(r2x1, r2y1, r2x2, r2y2));
			
			String token = scanner.nextLine();
			
			if (token.equals("overlaps?")){
				System.out.println(rectanglesOverlap(r1x1, r1x2, r2x1, r2x2, r1y1, r1y2, r2y1, r2y2));
			}else if(token.equals("exit")){
				break;
			}else{
				pos = token.indexOf("=");
				if (pos >= 4){
					val = Float.parseFloat(token.substring(pos +1, token.length()));
				}
				if (token.startsWith("r1x1")){
					r1x1 = val;
				}else if (token.startsWith("r1y1")){
					r1y1 = val;
				}else if (token.startsWith("r1x2")){
					r1x2 = val;
				}else if (token.startsWith("r1y2")){
					r1y2 = val;
				}else if (token.startsWith("r2x1")){
					r2x1 = val;
				}else if (token.startsWith("r2y1")){
					r2y1 = val;
				}else if (token.startsWith("r2x2")){
					r2x2 = val;
				}else if (token.startsWith("r2y2")){
					r2y2 = val;
				}
			}
			}
		}
		
		public boolean intervalsOverlap(double n1, double n2, double m1, double m2){
			if(n1 > m2 || n2 < m1){
				return false;
			}else{
				return true;
			}
		}
		
		public boolean rectanglesOverlap(double n1,double n2,double m1,double m2,double n3,double n4,double m3,double m4){
			return intervalsOverlap(n1,n2,m1,m2) && intervalsOverlap(n3,n4,m3,m4);
		}
		public String rectangle2String(double x1, double y1, double x2, double y2){
			return "(" + x1 + "," + y1 + ")" + "," + "(" + x2 + "," + y2 + ")";
		}
		
		public static void main (String[] args){
			new Rects().main();	
		}
}
