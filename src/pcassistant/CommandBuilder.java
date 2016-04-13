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
    String param;

    private CommandBuilder() //РєРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ 
    {

    }

    public static CommandBuilder GetInstance() {
        return instance;
    }

    public boolean HasNextCommand() {
        param = UserCommandListener.GetInstance().GetNextRequest();
        if (param != null) {
            return true;
        }
        return false;
    }

    public ICommand GetNextCommand() {
    switch(param)
    {
        case "hello":  return new SayHelloCommand();
        case "jock":  return new tellJock();
        case "time":  return new TellTime();
        //case "off": return new ComputerOff(param);
        //case "shutdown": return new ComputerOff(param);
        case "5": return new ComputerRstart();
        case "open": return new OpenProgramm();
        case "cat": return new Go_Cats();
        default : return new SaySomethingElse(param);
    }
       
    }

}
