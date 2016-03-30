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
        case "1":  return new SayHelloCommand();
        case "2":  return new tellJock();
        case "3":  return new TellTime();
        case "4": return new SearchKittens();
        case "5": return new ComputerOff(param);
        case "6": return new ComputerRstart();
        case "7": return new OpenProgramm();
        case "8": return new Go_Cats();
        default : return new SaySomethingElse(param);
    }
       
    }

}
