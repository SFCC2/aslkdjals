/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer_inout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Asus-PC
 */
public class Nuevo_buffer {

    FileInputStream ac;
    FileOutputStream b;

    public static void main(String[] args) {
        Nuevo_buffer admin = new Nuevo_buffer();
        admin.ejecutar(admin);
    }

    public void ejecutar(Nuevo_buffer admin) {
        try {
            BufferedInputStream in = null;
            BufferedOutputStream out = null;
            in = admin.buffer_in(admin);
            out = admin.buffer_out(admin);
            System.out.println("a");
            byte[] buff = new byte[32 * 1024];
             int len;
        while ((len = in.read(buff)) > 0)
      out.write(buff, 0, len);
    in.close();
    out.close();
            
        } catch (Exception e) {
        }
    }

    public BufferedInputStream buffer_in(Nuevo_buffer admin) {
        FileInputStream a = null;
        a = admin.files_In(a);
        BufferedInputStream in = new BufferedInputStream(a);
        return in;
    }

    public BufferedOutputStream buffer_out(Nuevo_buffer admin) {
        FileOutputStream a = null;
        a = admin.files_out(a);
        BufferedOutputStream out = new BufferedOutputStream(a);
        return out;
    }

    public FileInputStream files_In(FileInputStream a) {
        try {
            String fromFileName = "from.txt";

            a = new FileInputStream(fromFileName);
            ac = a;
        } catch (Exception e) {
        }
        return ac;
    }

    public FileOutputStream files_out(FileOutputStream a) {
        try {
            String toFileName = "to.txt";
            a = new FileOutputStream(toFileName);
            b = a;
        } catch (Exception e) {
        }
        return b;
    }
}
