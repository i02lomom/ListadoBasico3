import utiles.*;

/**
 * Define la clase BuscaArroba. Lee caracteres desde teclado hasta que introduzca la
 * arroba. Una vez introducida, se mostrará el número de caracteres introducidos entre
 * la B mayúscula y la T mayúscula. 
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class BuscaArroba{
    public static void main(String[] args) {
        int contador=0;
        char caracter;
        System.out.println("Introduce caracteres, cuando sea introducida una arroba, mostrare el numero de caracteres introducidos entre B y T..");
        do{
            caracter=Teclado.leerCaracter();
            if(caracter>='B' && caracter<='T'){
                contador++;
            }
        }while(caracter!='@');
        System.out.println("Has introducido " + contador + " caracteres entre B y T\n");
    }
}
