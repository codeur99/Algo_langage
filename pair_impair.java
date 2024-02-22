import java.util.Scanner;

public class pair_impair {

	public static void main(String[] args) {
		
		// déclaration de variable
		double nombre, reste;
		
		//enregistremenet des variables tapées par l'utilisateur
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez rentrer un nombre: ");
		nombre = clavier.nextDouble();
		reste = nombre%2;
		
		//La condition
		if(reste==0) {
			System.out.print("le nombre "+nombre+" est pair");
		}else {
			System.out.print("le nombre "+nombre+" est impair");
		}
		
		clavier.close();

	}
}
