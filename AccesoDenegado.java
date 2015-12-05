/**
 * Define la clase AccesoDenegado que simule el acceso a un sitio en función de dos
 * valores introducidos por el usuario: edad del usuario y autorización paterna. Sólo
 * aparecerá el mensaje "Bienvenido" si el usuario es mayor de edad o si siendo menor
 * de edad tiene la autorización paterna. En cualquier otro caso, que muestre Acceso
 * denegado
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class AccesoDenegado{
	public static void main(String[] args){
		int edad;
		char autorizacion;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		do{
			System.out.print("\nIntroduzca su edad: ");
			edad = scanner.nextInt();

			if(edad<1){
				System.out.print("\nError. Edad incorrecta.\n");
			}
		}while(edad<1);

		if(edad>=18){
			System.out.print("\nBienvenido\n");
		}

		else{
			System.out.print("\n¿Tiene autorizacion paterna? (s/n) ");
			autorizacion = scanner.next().charAt(0);		//Cogemos el primer caracter de la cadena

			if(autorizacion=='s' || autorizacion=='S'){
				System.out.print("\nBienvenido\n");
			}
			else{
				System.out.print("\nAcceso denegado\n");
			}
		}
	}
}
