import utiles.*;

/**
 * Define la clase CuentaCaracteres. Lee caracteres desde el teclado hasta que el usuario
 * introduce un asterisco. En ese caso, se mostrará un recuento de:
 *
 * a. Los dígitos introducidos [0-9]
 * b. Las minúsculas introducidos [a-z]
 * c. Las mayúsculas introducidos [A-Z]
 * d. El resto de caracteres (Sin contar el asterisco) 
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class CuentaCaracteres{
    public static void main(String[] args) {
        int digitos=0;
        int minusculas=0;
        int mayusculas=0;
        int otros=0;
        char caracter=' ';

        System.out.println("\nIntroduzca caracteres (* para terminar): \n");

        while(caracter!='*'){
            caracter=Teclado.leerCaracter();
            if(caracter>='0' && caracter<='9'){
                digitos++;
            }
            else if(caracter>='a' && caracter<='z'){
                minusculas++;
            }
            else if(caracter>='A' && caracter<='Z'){
                mayusculas++;
            }
            else if(caracter!='*'){
                otros++;
            }
        }
        System.out.println("Se han introducido " + digitos + " digitos\n");
        System.out.println("Se han introducido " + minusculas + " minusculas\n");
        System.out.println("Se han introducido " + mayusculas + " mayusculas\n");
        System.out.println("Se han introducido " + otros + " caracteres distintos a los anteriores\n");
    }
}
