
public class Media {

	public static void main(String[] args) {
		
		//Comienzo tiradas jugador1
		System.out.print(" pedro hace su 1º lanzamiento:");
		int tirada1 = (int) (Math.random()*6 + 1);
		//double Math.abs(tirada1);
		System.out.print(Math.abs(tirada1));
		System.out.print(" pedro hace su  2º lanzamiento:");
		int tirada2 =(int) (Math.random()*6 + 1);
		System.out.print(Math.abs(tirada2));
		//SUma tiradas jugador1
		int sumatirada1 = Math.round(tirada1 + tirada2);
		Math.round(sumatirada1);
		System.out.print("La suma de los lanzamientos de pedro es:" + ((sumatirada1)));

		//COmienzo tiradas jugador2
		System.out.print("Manuel hace su lanzamiento:");
		int tirada3 =(int) (Math.random()*6 + 1);
		System.out.print(Math.round(tirada3));
		System.out.print("Manuel hace su  2º lanzamiento:");
		int tirada4 = (int)(Math.random()*6 + 1);
		System.out.print(Math.round(tirada4));
		//Suma de tiradas del segundo jugador
		int sumatirada2 = tirada3 + tirada4;
		System.out.print("La suma de los lanzamientos de Manuel es:" + (sumatirada2));
		 
		
		int tiradamasalta = (int) Math.max(sumatirada1, sumatirada2);
		System.out.print("la tirada mas alta ha sido" + tiradamasalta);
		
		System.out.print("La media de las tiradas es:" +(tirada1+tirada2+tirada3+tirada4)/4);
		
	}
}