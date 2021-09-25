/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_karimguifarro;

/**
 *
 * @author karim
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
public class adminAs {
     private ArrayList<Asientos> as = new ArrayList();
    private File arch = null;

    public adminAs(String path) {
        arch=new File(path);
    }

    public ArrayList<Asientos> getAs() {
        return as;
    }

    public void setAs(ArrayList<Asientos> as) {
        this.as = as;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "adminAs{" + "as=" + as + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Asientos t : as) {
                bw.write(t.getMaterial()+ ";");
                bw.write(t.getTipo()+ ";");
                bw.write(t.getMasaje()+ ";");
                
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
        as = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                t = new vehiculo(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    as.add(new Asientos(sc.next(),
                            sc.next(),
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
