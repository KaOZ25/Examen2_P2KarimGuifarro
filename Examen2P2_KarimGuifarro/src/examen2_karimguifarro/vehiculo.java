package examen2_karimguifarro;

import java.io.File;

public class vehiculo {

    String VIN;
    String color;
    Bateria bateria;
    Carroceria carroceria;
    Infoentretenimiento infoentretenimiento;
    Asientos asientos;
    Interior interior;

    public vehiculo() {
    
    }

    public vehiculo(String VIN, String color, Bateria bateria, Carroceria carroceria, Infoentretenimiento infoentretenimiento, Asientos asientos, Interior interior) {
        this.VIN = VIN;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.infoentretenimiento = infoentretenimiento;
        this.asientos = asientos;
        this.interior = interior;
    }

    vehiculo(File arch) {
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Infoentretenimiento getInfoentretenimiento() {
        return infoentretenimiento;
    }

    public void setInfoentretenimiento(Infoentretenimiento infoentretenimiento) {
        this.infoentretenimiento = infoentretenimiento;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

  
}
