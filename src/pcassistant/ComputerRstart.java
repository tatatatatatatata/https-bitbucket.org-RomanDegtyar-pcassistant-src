/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.io.IOException;

/**
 *
 * @author ТРОЛЬ
 */
public class ComputerRstart implements ICommand{
       public void Execute() {
       String[] commands = { "shutdown", "/r /p"};
       try {
           Runtime.getRuntime().exec(commands);
       } catch (IOException ex) {
          System.out.println("Я не правильно отработал, мне можно а вам нельзя. Бе-бе-бе");
       }
   }
}
