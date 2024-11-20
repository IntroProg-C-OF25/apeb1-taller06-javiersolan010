/***
 *
 * @author javiersolan010
 */
import java.util.Scanner;
public class Ejercicio5_TipoOperacionMatematica {
    public static void main(String[] args) {
        int numOperacion;
        String tipoOperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 4 que represente una operacion matematica: ");
        System.out.print("1:Suma ");
        System.out.print("2:Resta ");
        System.out.print("3:Multiplicacion ");
        System.out.print("4:Division ");
        numOperacion = tcl.nextInt();
        switch (numOperacion) {
            case 1:
                tipoOperacion = "Suma";
                break;
            case 2:
                tipoOperacion = "Resta";
                break;
            case 3:
                tipoOperacion = "Multiplicacion";
                break;
            case 4:
                tipoOperacion = "Division";
                break;
            default:
                tipoOperacion = "Operacion no valida";
                break;
        }
        System.out.println("La operacion seleccionada es: " + tipoOperacion);
    }

}
    
/***
 * 
 */
