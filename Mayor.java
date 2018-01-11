import java.util.Scanner;
public class Mayor {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		System.out.print("digame un numero");
		double numero1 = (int) sc.nextDouble();
		System.out.print("digame otro numero");
		double numero2 = (int) sc.nextDouble();
		
		//System.out.println(Math.max(numero1, numero2));
		System.out.print("el mayor numero es" + Math.max(numero1, numero2));
	}

}
