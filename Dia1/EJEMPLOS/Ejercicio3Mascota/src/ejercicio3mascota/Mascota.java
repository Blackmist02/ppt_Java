/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3mascota;


public class Mascota {

    // Atributos
    String nombre;
    int energia;
    int felicidad;

    // Constructor
    public Mascota(String nombre, int energia, int felicidad) {

        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = felicidad;
    }

    // Método comer
    public void comer() {

        energia = energia + 20;

        System.out.println(nombre + " está comiendo...");
    }

    // Método jugar
    public void jugar() {

        felicidad = felicidad + 20;
        energia = energia - 10;

        System.out.println(nombre + " está jugando...");
    }

    // Método mostrarEstado
    public void mostrarEstado() {

        System.out.println();
        System.out.println("===== ESTADO DE " + nombre.toUpperCase() + " =====");

        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Felicidad: " + felicidad);
    }
}
