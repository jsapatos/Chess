package ajedrez;

public class Torre extends Peces{
	
	public Torre(int y, String color) {
		if  (y==1 | y==8) {
			setY(y);
		}
		if (color=="blanc" | color=="negre") {
			setColor(color);
			if (color=="negre") {
				setX(8);
			}
			else {
				setX(1);
			}
		}
	}
	
	public void veureMoviments() {
		for (int i = getX()+1; i < 9 ; i++) {
			System.out.println(i);
		}
		
		for (int i = getX()-1;i > 0	 ; i--) {
			System.out.println(i);
		}
	}
}
