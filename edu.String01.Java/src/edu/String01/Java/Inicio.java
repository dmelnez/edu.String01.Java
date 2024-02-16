package edu.String01.Java;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce una Frase: ");
		String frase01 = sc.next();
		
		System.out.println("Introduce otra Frase: ");
		String frase02 = sc.next();
		
		String fraseResul = frase01.concat(frase02);
		
		System.out.println("Tiene un total de " + fraseResul.length()  + " Caracteres");
		

	}

}
