

import java.util.Scanner;

public class Radio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor introduzca diametro: "); //corregir variable
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2.0);

		System.out.println(area);


	}

}
