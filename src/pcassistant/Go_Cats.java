/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ТРОЛЬ Переделать
 */
public class Go_Cats implements ICommand{
 //class myURL {
public void Execute() {
        try {
             File htmlFile = new File("kittens.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
            
        } catch (IOException ex) {
            System.out.println("Я неправильно отработал,ошибка в классе поиска котят");
        }
    }
}
//}

