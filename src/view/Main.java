package view;

import java.util.Scanner;

import controller.DivisionController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DivisionController dc = new DivisionController();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(dc.division(a, b));
		
		sc.close();
	}

}
