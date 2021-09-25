/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Infoentretenimiento {
    int cant_pantalla,ancho_pantalla;
    String visor;

    public Infoentretenimiento() {
    }

    public Infoentretenimiento(int cant_pantalla, int ancho_pantalla, String visor) {
        this.cant_pantalla = cant_pantalla;
        this.ancho_pantalla = ancho_pantalla;
        this.visor = visor;
    }

    public int getCant_pantalla() {
        return cant_pantalla;
    }

    public void setCant_pantalla(int cant_pantalla) {
        this.cant_pantalla = cant_pantalla;
    }

    public int getAncho_pantalla() {
        return ancho_pantalla;
    }

    public void setAncho_pantalla(int ancho_pantalla) {
        this.ancho_pantalla = ancho_pantalla;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    @Override
    public String toString() {
        return "cant_pantalla=" + cant_pantalla + ", ancho_pantalla=" + ancho_pantalla + ", visor=" + visor + '}';
    }

    
    
}
