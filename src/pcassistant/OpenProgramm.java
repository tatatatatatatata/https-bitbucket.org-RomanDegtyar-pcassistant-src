/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ТРОЛЬ
 */
public class OpenProgramm implements ICommand {

    public void Execute() {
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException ex) {
            System.out.println("Я не правильно отработал, мне можно а вам нельзя. Бе-бе-бе");
        }
    }

}
