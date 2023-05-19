/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author HP
 */
public class Observador {
    private String nombre;

    public Observador(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar() {
        System.out.println("El Observador " + nombre + " ha sido notificado del cambio.");
    }
}
