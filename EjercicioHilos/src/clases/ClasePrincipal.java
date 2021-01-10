package clases;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primer numero");
		int num1 = sc.nextInt();
		System.out.println("Segundo numero");
		int num2 = sc.nextInt();
		System.out.println("Tercer numero");
		int num3 = sc.nextInt();
		
		Hilillo hilo1 = new Hilillo(num1);
		Thread t1 = new Thread(hilo1,"Hilo 1");
		
		Hilillo hilo2 = new Hilillo(num2);
		Thread t2 = new Thread(hilo2,"Hilo 2");
		
		Hilillo hilo3 = new Hilillo(num3);
		Thread t3 = new Thread(hilo3,"Hilo 3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
