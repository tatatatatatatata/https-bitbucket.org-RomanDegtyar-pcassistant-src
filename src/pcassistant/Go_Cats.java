/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ТРОЛЬ Переделать
 */
public class Go_Cats implements ICommand{
 //class myURL {
@Override
public void Execute() {

    try {
        URL hp = new URL("https://www.google.ru/");
        
        System.out. println("Protocol: " + hp.getProtocol());
        
        System.out.println("Port: " + hp.getPort());
        
        System.out.println("Host: " + hp.getHost());
        
        System.out.println("File: " + hp.getFile());
        
        System.out.println("Exit: " + hp.toExternalForm());
    } catch (MalformedURLException ex) {
        Logger.getLogger(Go_Cats.class.getName()).log(Level.SEVERE, null, ex);
    }

} }   
//}

