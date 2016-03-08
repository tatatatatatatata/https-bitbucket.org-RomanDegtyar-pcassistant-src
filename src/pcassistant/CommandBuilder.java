/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

/**
 *
 * @author РўР РћР›Р¬
 */
public class CommandBuilder {

    private static CommandBuilder instance = new CommandBuilder();
    String command;

    private CommandBuilder() //РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ 
    {

    }

    public static CommandBuilder GetInstance() {
        return instance;
    }

    public boolean HasNextCommand() {
        command = UserCommandListener.GetInstance().GetNextRequest();
        if (command != null) {
            return true;
        }
        return false;
    }

    public ICommand GetNextCommand() {
    switch(command)
    {
        case "1":  return new SayHelloCommand();
        default : return new SaySomethingElse(command);
    }
       
    }

}
