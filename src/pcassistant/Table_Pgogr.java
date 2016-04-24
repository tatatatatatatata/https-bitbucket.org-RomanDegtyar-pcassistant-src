/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ТРОЛЬ
 */
public class Table_Pgogr {
    
    public static String NameToPath (String programName)
    {  
        Map <String, String> Table = new HashMap<>();
        Table.put("Skype", "C:/...");
        
               
        return Table.get(programName);
    }
}
