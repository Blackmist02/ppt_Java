/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;

        // Solicitar números
        System.out.println("===== MINI CALCULADORA =====");

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextDouble();

        // Operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;

        System.out.println();
        System.out.println("===== RESULTADOS =====");

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        // Validar división por cero
        if (numero2 != 0) {

            double division = numero1 / numero2;

            System.out.println("División: " + division);

        } else {

            System.out.println("División: No se puede dividir por cero.");
        }

        sc.close();
    }
}
