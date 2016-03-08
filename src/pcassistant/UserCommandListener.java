/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class UserCommandListener {
   private UserCommandListener(){}
   private static UserCommandListener instance = new UserCommandListener();
   public static UserCommandListener GetInstance() {
        return instance;
    }
   public String GetNextRequest(){
       Scanner scanner = new Scanner(System.in);
       String command = scanner.next();
       return command;
   }
}
