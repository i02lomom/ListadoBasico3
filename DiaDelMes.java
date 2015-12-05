/**
 * Define la clase DiaDelMes
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class DiaDelMes{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("\nIntroduzca un mes valido: ");
		int mes=scanner.nextInt();

		if(mes<1 || mes>12){
			System.out.println("\nError. El mes introducido no es valido: ");
			return;
		}
		System.out.println("\nIntroduzca un año valido: ");
		int anno=scanner.nextInt();
		if(anno<0){
			System.out.println("\nError. El año introducido no es valido: ");
			return;
		}
		switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("\nTiene 31 dias\n");
				break;
			case 2:
				if ((anno%4==0) && ((anno%100!=0) || (anno%400==0))){
					System.out.println("\nTiene 29 dias\n");
				}
				else{
					System.out.println("\nTiene 28 dias\n");
				}
				break;
			default:
				System.out.println("\nTiene 30 dias\n");
		}
	}
}
