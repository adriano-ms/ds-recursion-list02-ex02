package controller;

public class DivisionController {
	
	public DivisionController() {
		super();
	}
	
	public int division(int a, int b) {
		if(+a < +b || a == 0 || b == 0) {
			return 0;
		} else {
			return 1 + division(+a - +b, +b);
		}
	}
}
