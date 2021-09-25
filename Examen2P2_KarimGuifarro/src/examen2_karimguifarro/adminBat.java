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
public class adminBat {
     private ArrayList<Bateria> bat = new ArrayList();
    private File arch = null;

    public adminBat(String path) {
         arch = new File(path);
    }

    public ArrayList<Bateria> getbat() {
        return bat;
    }

    public void setEns(ArrayList<Bateria> bat) {
        this.bat = bat;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "adminBat{" + "bat=" + bat + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Bateria t : bat) {
                bw.write(t.getMaterial() + ";");
                bw.write(t.getAutonomia() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        bat = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    bat.add(new Bateria(
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
