/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author аках
 */
public class TellTime implements ICommand {

    @Override
    public void Execute() {
      Date data = new Date();
      SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy hh:mm");
      System.out.println(form.format(data));
    }
    
}
