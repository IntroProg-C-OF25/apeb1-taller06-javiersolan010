/***
 *
 * @author javiersolan010
 */
import java.util.Scanner;
public class Ejercicio3_CostoPaquetes {
    public static void main(String[] args) {
        double peso, costoEnvio;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PESO DEL PAQUETE (KG): ");
        peso = tcl.nextDouble();
        System.out.println("INGRESE LA REGION (local/nacional/internacional): ");
        region = tcl.next();
        if (peso < 5 && region.equals("local")) {
            costoEnvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoEnvio = 10;
        } else {
            costoEnvio = 15;
        }
        System.out.printf("El costo de envio es: " + costoEnvio + "$");

    }

}
/***
 * run:
INGRESE EL PESO DEL PAQUETE (KG): 12
INGRESE LA REGION (local/nacional/internacional): 
local
El costo de envio es: 15.0$BUILD SUCCESSFUL (total time: 6 seconds)
 */
    

