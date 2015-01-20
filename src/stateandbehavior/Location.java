package stateandbehavior;

public class Location {
	public int x;
	public int y;
	
	public void up(){
		y--;
		}
	
	public void down(){
		y++;
	}
	
	public void left(){
		x--;
	}
	
	public void right(){
		x++;
	}
	
	public static void main(String[] args){
		new Location();
	}
	
}
