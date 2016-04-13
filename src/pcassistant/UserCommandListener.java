/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcassistant;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roman
 */
public class UserCommandListener {

    LiveSpeechRecognizer recognizer;
    private UserCommandListener() {

        Configuration configuration = new Configuration();

        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
        configuration.setUseGrammar(true);
        configuration.setGrammarName("grammar");

        try {
            configuration.setGrammarPath(new File("").toURI().toURL().toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(UserCommandListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            recognizer = new LiveSpeechRecognizer(configuration);
            // Start recognition process pruning previously cached data.
            
            // Pause recognition process. It can be resumed then with startRecognition(false).
        } catch (IOException ex) {
            Logger.getLogger(UserCommandListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static UserCommandListener instance = new UserCommandListener();

    public static UserCommandListener GetInstance() {
        return instance;
    }

    public String GetNextRequest() {
        recognizer.startRecognition(true);
        SpeechResult result = recognizer.getResult();
        String kmd;
        kmd=result.getHypothesis();
        System.out.println("Было услышано:" + kmd);
        recognizer.stopRecognition();
        return kmd;

    }
}
