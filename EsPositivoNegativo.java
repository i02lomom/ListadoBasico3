/**
 * Define la clase EsPositivoNegativo que pide repetidas veces un entero por teclado e
 * indica si es positivo o negativo. En caso de ser cero, se sale del programa diciendo
 * adiós. Crea tres versiones con las tres estructuras repetitivas y utilizando la sentencia
 * break
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class EsPositivoNegativo{
	public static void main(String []args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int numero;
		System.out.println("\nCon while\n");
		while (true){
			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();

			if(numero==0){
				System.out.println("\nAdios");
				break;
			}
			else if(numero>0)
				System.out.println("\nEl numero introducido es positivo.");
			else
				System.out.println("\nEl numero introducido es negativo.");
		}
		System.out.println("\nCon do..while\n");
		do{
			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();

			if(numero==0){
				System.out.println("\nAdios");
				break;
			}
			else if(numero>0)
				System.out.println("\nEl numero introducido es positivo.");
			else
				System.out.println("\nEl numero introducido es negativo.");
		}while(true);
		System.out.println("\nCon for\n");
		for(;;){
			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();

			if(numero==0){
				System.out.println("\nAdios");
				break;
			}
			else if(numero>0)
				System.out.println("\nEl numero introducido es positivo.");
			else
				System.out.println("\nEl numero introducido es negativo.");
		}
	}
}
