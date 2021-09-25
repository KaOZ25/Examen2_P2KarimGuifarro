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
public class AdminIn {
     private ArrayList<Infoentretenimiento> info = new ArrayList();
    private File arch = null;

    public AdminIn(String path) {
        arch = new File(path);
    }

    public ArrayList<Infoentretenimiento> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Infoentretenimiento> info) {
        this.info = info;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "AdminIn{" + "info=" + info + '}';
    }
       public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Infoentretenimiento t : info) {
                bw.write(t.getAncho_pantalla() + ";");
                bw.write(t.getCant_pantalla()+ ";");
                bw.write(t.getVisor()+ ";");
                
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
        info = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                t = new vehiculo(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    info.add(new Infoentretenimiento(sc.nextInt(),
                            sc.nextInt(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
}
