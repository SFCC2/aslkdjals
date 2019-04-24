/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer_inout;

import java.io.IOException;

/**
 *
 * @author Asus-PC
 */
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Logger logger = new Logger("log.txt");
            logger.log("Log message 1");
            logger.log("Log message 2");
            logger.close();
        }catch (IOException ex) {
             ex.printStackTrace();
        }
        }/*
        try {
            Logger logger = new Logger("log.txt");
            logger.log("Log message 1");
            logger.log("Log message 2");
            logger.close();
            catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        }*/
    }


