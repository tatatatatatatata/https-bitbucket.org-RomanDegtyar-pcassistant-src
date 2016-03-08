/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

/**
 *
 * @author Roman
 */
public class SaySomethingElse implements ICommand {
    String command;
    public SaySomethingElse (String command)
    {
        this.command = command;
    }

    @Override
    public void Execute() {
     System.out.println(command);
    }
    
}
