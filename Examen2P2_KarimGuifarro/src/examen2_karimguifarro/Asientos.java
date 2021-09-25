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
public class Asientos {
    String  material,tipo;
    String masaje;

    public Asientos() {
    }

    public Asientos(String material, String tipo, String masaje) {
        this.material = material;
        this.tipo = tipo;
        this.masaje = masaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMasaje() {
        return masaje;
    }

    public void setMasaje(String masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "material=" + material + ", tipo=" + tipo + ", masaje=" + masaje + '}';
    }
    
   
}
