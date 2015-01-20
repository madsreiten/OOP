package Oving0;

public class RectsCore {
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
	
}
