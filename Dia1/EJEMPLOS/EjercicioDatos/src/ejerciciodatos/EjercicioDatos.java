/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodatos;
import java.util.Scanner;

public class EjercicioDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Scanner
        Scanner sc = new Scanner(System.in);

        // Variables
        String nombre;
        String rut;
        String correo;
        int edad;
        String ciudad;

        // Solicitar datos
        System.out.println("===== INGRESO DE DATOS =====");

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su RUT: ");
        rut = sc.nextLine();

        System.out.print("Ingrese su correo: ");
        correo = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        sc.nextLine(); // Limpiar el Scanner

        System.out.print("Ingrese su ciudad: ");
        ciudad = sc.nextLine();

        // Mostrar datos
        System.out.println();
        System.out.println("===== DATOS INGRESADOS =====");

        System.out.println("Nombre : " + nombre);
        System.out.println("RUT    : " + rut);
        System.out.println("Correo : " + correo);
        System.out.println("Edad   : " + edad);
        System.out.println("Ciudad : " + ciudad);

        sc.close();
    }
}