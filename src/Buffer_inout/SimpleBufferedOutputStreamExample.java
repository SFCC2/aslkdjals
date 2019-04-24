/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer_inout;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Asus-PC
 */
public class SimpleBufferedOutputStreamExample {

    public static void main(String[] args) {

        try {
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("textfile.txt"));
            stream.write("Hello, World!".getBytes());
            stream.write(System.lineSeparator().getBytes());
            stream.write("I am writting into a file using BufferedOutputStream".getBytes());
            stream.write(System.lineSeparator().getBytes());
            stream.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }
}
