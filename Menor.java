import java.util.Scanner;
public class Menor {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner sc = new Scanner(System.in);
		System.out.print("digame un numero");
		double numero1 = (int) sc.nextDouble();
		System.out.print("digame otro numero");
		double numero2 = (int) sc.nextDouble();
		
		//System.out.println(Math.max(numero1, numero2));
		System.out.print("el menor numero es" + Math.min(numero1, numero2));
	}

}
