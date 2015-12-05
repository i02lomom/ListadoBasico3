/**
 * Define la clase Intercambio que pide dos enteros por teclado e intercambia el valor de
 * ambas variables. Muestra el valor antes y después del intercambio.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Intercambio{
	public static void main(String[] args){
		int n1,n2,aux;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroduzca el primer numero: ");
		n1 = scanner.nextInt();
		System.out.print("\nIntroduzca el segundo numero: ");
		n2 = scanner.nextInt();

		aux=n1;
		n1=n2;
		n2=aux;

		System.out.print("\nTras el intercambio el primer numero es: "+n1+"\n");
		System.out.print("\nTras el intercambio el segundo numero es: "+n2+"\n");
	}
}
