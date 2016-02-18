/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

/**
 *
 * @author ТРОЛЬ
 */
public class CommandBuilder {

    private static CommandBuilder instance = new CommandBuilder();

    private CommandBuilder() //конструктор 
    {

    }

    public static CommandBuilder GetInstance() {
        return instance;
    }

    public boolean HasNextCommand() {
        return false;
    }

    public ICommand GetNextCommand() {
        return null;
    }
}
