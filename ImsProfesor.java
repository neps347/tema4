import java.util.Scanner;

public class ImsProfesor {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	//introduccion primera variable Kilogramos/peso //
	System.out.print("Por favor introduzca su peso en kilogramos: "); 
	double kilogramos = sc.nextDouble();
	double peso = kilogramos;

	//introduccion segunda variable Altura/metros //
	System.out.print("Bienvenido puede decirme que altura tienes para " + peso + " kilogramos ");
	double altura = sc.nextDouble();
	double metros = altura;
	
	//Frase con Kilogramos y altura//
	System.out.print("vamos a calcular IMC para " + peso + " kilogramos y " + altura + " metros.");
	
	
	//Calculo IMC en base a datos obtenidos CON POW error 30¿?corregido! añadir 2 Potencia//
	double imc = peso / Math.pow(altura, 2);
	//IMS = peso / altura2
	
	//Frase con Resultado de la operacion de calculo//
	System.out.print("Tu imc "+"es de"  + imc);
	
	//float imc = 
	
	//Añadido nuevo Pow
	
	//System.out.println (Math.pow(altura, altura));
			System.out.println("Tu imc deberia de estar entre 18 y 25 " + (18>25));

	}
}

