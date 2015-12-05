/**
 * Define la clase LeeEnteros. Lee 10 enteros e indica al final si se ha introducido algún
 * cero.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class LeeEnteros{
	public static void main(String[] args){
		int numero;
		int contador;
		boolean cero=false;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		for(contador=0;contador<10;contador++){
			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();
			if(numero==0)
				cero=true;
		}
		if(cero==true)
			System.out.print("\nSe ha introducido algun cero\n");
		else
			System.out.print("\nNo se ha introducido ningun cero\n");
	}
}
