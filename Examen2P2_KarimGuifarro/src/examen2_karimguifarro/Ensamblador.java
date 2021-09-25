package examen2_karimguifarro;

public class Ensamblador {

    String ID, nombre, genero, edad;
    int cant_vehiculos;

    public Ensamblador() {
    }

    public Ensamblador(String ID, String nombre, String genero, String edad, int cant_vehiculos) {
        this.ID = ID;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.cant_vehiculos = cant_vehiculos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getCant_vehiculos() {
        return cant_vehiculos;
    }

    public void setCant_vehiculos(int cant_vehiculos) {
        this.cant_vehiculos = cant_vehiculos;
    }
    
}
