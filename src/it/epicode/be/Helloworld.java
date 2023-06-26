package it.epicode.be;

import java.util.Arrays;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");

		// Output Es2
		
		// parte1
		System.out.println(moltiplica(4, 8));
		
		//parte2
		System.out.println(concatena("Super", 8));

		//parte3
		String myArray[] = { "uno", "due", "tre", "quattro", "cinque" };
		String newString = "ciao";

		System.out.println(inserisciInArray(myArray, newString));

		// Output Es3
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la prima stringa");
		String primaStringa = scanner.nextLine();

		System.out.println("Inserisci la seconda stringa");
		String secondaStringa = scanner.nextLine();

		System.out.println("Inserisci la terza stringa");
		String terzaStringa = scanner.nextLine();

		System.out.println(primaStringa + secondaStringa + terzaStringa);

		scanner.close();

		// Output Es4
		
		//parte1

		double base = 7.324;
		int altezza = 3;

		System.out.println(perimetroRetangolo(base, altezza));
		
		//parte2

		int numero1 = 2;
		int numero2 = 3;

		System.out.println(pariDispari(numero1));
		System.out.println(pariDispari(numero2));
		
		//parte3
		
		double lato1 = 10.456;
		double lato2 = 13.248;
		double lato3 = 18.114;
		
		System.out.println(perimetroTriangolo(lato1, lato2, lato3));
		
		
	}
	
	//Metodo Es 2 parte 1
	public static int moltiplica(int num1, int num2) {
		return num1 * num2;
	}
	
    //Metodo Es2 parte2
	public static String concatena(String word1, int num1) {
		return word1 + num1;
	}
    
	//Metodo Es2 parte3
	public static String inserisciInArray(String[] arr, String str) {

		String[] newArray = new String[6];

		newArray[0] = arr[0];
		newArray[1] = arr[1];
		newArray[2] = arr[2];
		newArray[3] = str;
		newArray[4] = arr[3];
		newArray[5] = arr[4];

		return Arrays.toString(newArray);
	}
	
    //Metodo Es4 parte1
	public static double perimetroRetangolo(double num1, int num2) {
		return ((num1 + num2) * 2);
		
	}
	//Metodo Es4 parte2
	public static int pariDispari(int num1) {
		return (num1 % 2) == 0 ? 0 : 1;
	}
	
	//Metodo Es4 parte3
	public static double perimetroTriangolo(double num1, double num2, double num3) {
		double perimetro = num1+num2+num3;
		return Math.sqrt((perimetro/2)*(perimetro-num1)*(perimetro-num2)*(perimetro-num3));
		
	}



}
