
package examen2_karimguifarro;

public class orden_armado {
    vehiculo vehi;
    Ensamblador ensam;

    public orden_armado() {
    }
    
    public orden_armado(vehiculo vehi, Ensamblador ensam) {
        this.vehi = vehi;
        this.ensam = ensam;
    }

    public vehiculo getVehi() {
        return vehi;
    }

    public void setVehi(vehiculo vehi) {
        this.vehi = vehi;
    }

    public Ensamblador getEnsam() {
        return ensam;
    }

    public void setEnsam(Ensamblador ensam) {
        this.ensam = ensam;
    }
    
}
