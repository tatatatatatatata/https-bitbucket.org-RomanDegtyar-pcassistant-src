/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ТРОЛЬ
 */
public class ComputerOff implements ICommand{
      String times;
    public ComputerOff (String times)
    {
        this.times = times;//Запилить считывание времени отдельно(как отдельной переменной)
    }
   public void Execute() {
       String[] commands = { "shutdown", "/s" };
       try {
           Runtime.getRuntime().exec(commands);
       } catch (IOException ex) {
          System.out.println("Я не правильно отработал, мне можно а вам нельзя. Бе-бе-бе");
       }
       
       
   }      
}
