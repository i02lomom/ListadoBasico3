/**
 * Define la clase Menor que pide repetidas veces dos enteros por teclado e indica cuál
 * es el menor. En caso de ser iguales se sale del programa diciendo adiós. Utiliza la
 * sentencia break
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class Menor{
	public static void main(String[] args){
		int n1,n2;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while(true){
			System.out.print("\nIntroduzca el primer numero: ");
			n1 = scanner.nextInt();
			System.out.print("\nIntroduzca el segundo numero: ");
			n2 = scanner.nextInt();

			if(n1<n2){
				System.out.print("\n"+n1+" es menor que "+n2+"\n");
			}
			else if(n2<n1){
				System.out.print("\n"+n2+" es menor que "+n1+"\n");
			}
			else if(n1==n2){
				System.out.print("\nAdios\n");
				break;
			}
		}
	}
}
