package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int fatorialDuplo(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fatorialDuplo(n - 2);
		}
	}
}
