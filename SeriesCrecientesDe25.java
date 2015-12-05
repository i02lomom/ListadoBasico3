/**
 * Define la clase SeriesCrecientesDe25. Utilizando las tres estructuras de repetición
 * (while, do while y for) genera la serie del 0 al 1000 con un incremento de 25 (ambos
 * incluídos)
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SeriesCrecientesDe25{
	public static void main(String[] args){
		int i=0;
		System.out.println("\nCon while\n");

		while(i<=1000){
			System.out.print(i+"\t");
			i+=25;
		}
		i=0;
		System.out.println("\nCon do..while\n");
		
		do{
			System.out.print(i+"\t");
			i+=25;
		}while(i<=1000);
		System.out.println("\nCon for\n");

		for(i=0;i<=1000;i+=25){
			System.out.print(i+"\t");
		}
	}
}
