/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

import java.io.*;
import java.util.*;

public class administrar2 {

    private ArrayList<Ensamblador> ens = new ArrayList();
    private File arch = null;

    public administrar2(String path) {
        arch = new File(path);
    }

    public ArrayList<Ensamblador> getEnsamblador() {
        return ens;
    }

    public void setEnsamblador(ArrayList<Ensamblador> cliente) {
        this.ens = ens;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "administrar{" + "cliente=" + ens + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Ensamblador t : ens) {
                bw.write(t.getID() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getGenero() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getCant_vehiculos() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ens = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ens.add(new Ensamblador(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
