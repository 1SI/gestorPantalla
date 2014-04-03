/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.*;

/**
 *
 * @author A7
 */
public class GestorPantalla {
    private String mensaje = "";
    private Pantalla parent;
    
    
    public GestorPantalla(Pantalla miPantalla) {
        this.parent = miPantalla;
    }
    
    public void actualizarMensaje(){
        Pantalla.getInstance().notificarMensaje(mensaje);
    }
    
    public void addMensaje(){
        Pantalla.getInstance().notificarMensaje(mensaje);
    }
    
    public void deleteMensaje(){
        Pantalla.getInstance().notificarMensaje(mensaje);
    }
    
    
    
}
