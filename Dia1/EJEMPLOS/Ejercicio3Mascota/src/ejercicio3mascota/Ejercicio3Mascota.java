/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3mascota;

public class Ejercicio3Mascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear primera mascota
        Mascota mascota1 = new Mascota(
                "Max",
                50,
                60
        );

        // Crear segunda mascota
        Mascota mascota2 = new Mascota(
                "Luna",
                70,
                80
        );

        // Mascota 1 come
        mascota1.comer();

        // Mascota 1 juega
        mascota1.jugar();

        // Mascota 2 come
        mascota2.comer();

        // Mascota 2 juega
        mascota2.jugar();

        // Mostrar estados
        mascota1.mostrarEstado();

        mascota2.mostrarEstado();
    }
}
