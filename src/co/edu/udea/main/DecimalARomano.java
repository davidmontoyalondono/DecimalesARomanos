package co.edu.udea.main;

public class DecimalARomano {
	
	public DecimalARomano(){
		
	}
	
	public String convertirRomano(int num) {
		String romano = "";
		int[] numeros = {1000, 900,500, 100, 90, 50, 10, 9,5, 1};
		String[] letras = {"M","CM","D", "C","XC", "L", "X", "IX", "V", "I"};
		System.out.println("Numero inicial: " + num);
		
		for (int i = 0; num >= 1; i++) {
		int x = num / numeros[i];
		System.out.println("Division numero " + i +" "+ num +"/"+ numeros[i] + " resultado = "  + x);
		
		if (x < 4) {
		for (int j = 0; j < x; j++) {
		romano += letras[i];
		System.out.println("X: " + x + " pos i: " + i);
		}
		} else {
		for (int j = 0; j < 5 - x; j++) {
            romano += letras[i];
		}
		 System.out.println("x: " + x +  " pos i: " + i);
		 romano += letras[i - 1];
		}
		num -= x * numeros[i];
		}
		return romano;
		}
		
	
	
}
