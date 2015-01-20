package Oving0;

import java.util.Scanner;

public class RectsUI {
	private RectsCore rc = new RectsCore();
	private Scanner scanner;
	public void main(){
		scanner = new Scanner(System.in);
		while(true){
		System.out.println("Rect1: " + rc.rectangle2String(rc.r1x1, rc.r1y1, rc.r1x2, rc.r1y2));
		System.out.println("Rect2: " + rc.rectangle2String(rc.r2x1, rc.r2y1, rc.r2x2, rc.r2y2));
		
		String token = scanner.nextLine();
		
		if (token.equals("overlaps?")){
			System.out.println(rc.rectanglesOverlap(rc.r1x1, rc.r1x2, rc.r2x1, rc.r2x2, rc.r1y1, rc.r1y2, rc.r2y1, rc.r2y2));
		}else if(token.equals("exit")){
			break;
		}else{
			rc.pos = token.indexOf("=");
			if (rc.pos >= 4){
				rc.val = Float.parseFloat(token.substring(rc.pos +1, token.length()));
			}
			if (token.startsWith("r1x1")){
				rc.r1x1 = rc.val;
			}else if (token.startsWith("r1y1")){
				rc.r1y1 = rc.val;
			}else if (token.startsWith("r1x2")){
				rc.r1x2 = rc.val;
			}else if (token.startsWith("r1y2")){
				rc.r1y2 = rc.val;
			}else if (token.startsWith("r2x1")){
				rc.r2x1 = rc.val;
			}else if (token.startsWith("r2y1")){
				rc.r2y1 = rc.val;
			}else if (token.startsWith("r2x2")){
				rc.r2x2 = rc.val;
			}else if (token.startsWith("r2y2")){
				rc.r2y2 = rc.val;
			}
		}
		}
	}
	public static void main (String[] args){
		new Rects().main();	
	}
}
