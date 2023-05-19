/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

/**
 *
 * @author HP
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear el objeto Notificador
        Notificador notificador = new Notificador();

        // Crear los Observadores
        Observador observador1 = new Observador("Observador 1");
        Observador observador2 = new Observador("Observador 2");

        // Agregar los Observadores al Notificador
        notificador.agregarObservador(observador1);
        notificador.agregarObservador(observador2);

        // Notificar cambios a los Observadores
       notificador.notificarCambios();

        // Eliminar un Observador
        notificador.eliminarObservador(observador2);

        // Notificar cambios nuevamente
        notificador.notificarCambios();
    }
    
}
