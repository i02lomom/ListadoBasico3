import utiles.*;
/**
 * Define la clase DosNumeros. Lee dos enteros hasta que sean distintos. Si no lo son, se
 * mostrará el mensaje "Son iguales". Una vez introducidos ambos de forma correcta se
 * mostrará el menor de ellos. Utiliza el operador ?
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class DosNumeros{
    public static void main(String[] args) {
        int n1,n2,menor;

        while(true){
            n1=Teclado.leerEntero("Introduzca el primer numero: ");
            n2=Teclado.leerEntero("Introduzca el segundo numero: ");
            menor=(n1<n2)? n1:n2;
            if(n1==n2)
            {
                System.out.println("Son iguales\n");
            }   
            else{
                System.out.println("\nEl menor es: "+menor+"\n");
                break;
            }
        }
    }
}
