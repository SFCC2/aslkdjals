/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer_inout;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Asus-PC
 */
public class Logger {

    private BufferedOutputStream stream;

    public Logger(String filename) throws FileNotFoundException {
        this.stream = new BufferedOutputStream(new FileOutputStream(filename));
    }

    public Logger(File f) throws FileNotFoundException {
        this.stream = new BufferedOutputStream(new FileOutputStream(f));
    }

    public void log(String s) throws IOException {
        String date = new Date().toString();
        String message = String.format("%s : %s", date, s);
        this.stream.write(message.getBytes());
        this.stream.write(System.lineSeparator().getBytes());
        this.stream.flush();
    }

    public void close() throws IOException {
        this.stream.close();
    }
}
