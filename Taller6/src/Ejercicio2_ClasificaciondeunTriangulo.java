/***
 *
 * @author javiersolan010
 */
import java.util.Scanner;
public class Ejercicio2_ClasificaciondeunTriangulo {
     public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese los 3 lados del triangulo: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilatero");
        } else 
            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo iosceles");
        } else {
                System.out.println("Triangulo escaleno");
        
          }
        }
    }
}
/***
 * run:
Ingrese los 3 lados del triangulo: 5 5 4
Triangulo iosceles
BUILD SUCCESSFUL (total time: 29 seconds)
 */
