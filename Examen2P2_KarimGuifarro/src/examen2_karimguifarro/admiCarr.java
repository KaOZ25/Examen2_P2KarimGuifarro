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
public class admiCarr {
    
    private ArrayList<Carroceria> carr = new ArrayList();
    private File arch = null;

    public admiCarr(String path) {
         arch = new File(path);
    }

    public ArrayList<Carroceria> getCarr() {
        return carr;
    }

    public void setCarr(ArrayList<Carroceria> carr) {
        this.carr = carr;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "admiCarr{" + "carr=" + carr + '}';
    }

     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Carroceria t : carr) {
                bw.write(t.getTipo() + ";");
                bw.write(t.getCap_maletero()+ ";");
                
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
        carr = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                t = new vehiculo(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    carr.add(new Carroceria(sc.next(),
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
