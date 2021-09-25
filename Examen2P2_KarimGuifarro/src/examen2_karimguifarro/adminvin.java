/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author karim
 */
public class adminvin {
    private ArrayList<Vin> vin = new ArrayList();
    private File arch = null;

    public adminvin(String path) {
        arch = new File(path);
        
    }

    public ArrayList<Vin> getVin() {
        return vin;
    }

    public void setVin(ArrayList<Vin> vin) {
        this.vin = vin;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "adminvin{" + "vin=" + vin + '}';
    }
       public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Vin t : vin) {
                bw.write(t.getVin() + ";");
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
        vin = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                t = new vehiculo(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    vin.add(new Vin(sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
    
}
