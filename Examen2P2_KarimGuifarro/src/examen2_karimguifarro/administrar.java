/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class administrar {

    private ArrayList<vehiculo> vehi = new ArrayList();
    private File arch = null;

    public administrar(String path) {
        arch = new File(path);
    }

    public ArrayList<vehiculo> getVehiculo() {
        return vehi;
    }

    public void setCliente(ArrayList<vehiculo> cliente) {
        this.vehi = vehi;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "administrar{" + "cliente=" + vehi + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (vehiculo t : vehi) {
                bw.write(t.getVIN() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getBateria() + ";");
                bw.write(t.getCarroceria() + ";");
                bw.write(t.getInterior() + ";");
                bw.write(t.getInfoentretenimiento() + ";");
                bw.write(t.getAsientos() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        vehiculo t=null;
        Scanner sc = null;
        vehi = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                t = new vehiculo(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    vehi.add(new vehiculo(sc.next(),
                            sc.next(),
                            t.bateria,
                            t.carroceria,
                            t.infoentretenimiento,
                            t.asientos,
                            t.interior
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
