
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class Main {
   public static void main(String[] args) {
       try {
            String fromFileName = "from.txt";
    String toFileName = "to.txt";
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(fromFileName));
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(toFileName));
    byte[] buff = new byte[32 * 1024];
    int len;
           for (int len2 = 0; len2 < in.read(buff); len2++) {
               System.out.println(buff+" "+0+" "+len2);
           }
    /*while ((len = in.read(buff)) > 0)
      out.write(buff, 0, len);*/
    in.close();
    out.close();
       } catch (Exception e) {
       }
  }
}