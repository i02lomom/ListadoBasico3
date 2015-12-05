/**
 * Define la clase BuscandoElCero. Utilizando el método Math.random() que devuelve un
 * número aleatorio entre 0 y 1 [0, 1) comprueba mediante un bucle infinito si el
 * resultado en algún momento da el valor 0. Utiliza la sentencia break para salir del
 * bucle
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class BuscandoElCero{
	public static void main(String[] args){
		double numero;

		while(true){
			numero=Math.random();
			System.out.print("\n"+numero);
			if(numero==0.0)
				break;
		}
	}
}
