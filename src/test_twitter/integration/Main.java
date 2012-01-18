/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_twitter.integration;

import java.io.File;
import java.io.IOException;
import twitter4j.TwitterException;


public class Main {

    public static void main(String args[]) throws IOException, TwitterException {
        checkFileExistence();
        HomePage form = new HomePage();
        form.setVisible(true);
        //This is another comment to test git. 
    }

    private static void checkFileExistence() throws IOException {
        File file;
        TokenHandler handler = new TokenHandler();
        file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2.txt");
        if (!file.exists()) {
            handler.createFile();
        }
        file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2secret.txt");
        if (!file.exists()) {
            handler.createFile();
        }
        String consumerKey = handler.retrieveConsumerKey();
        String consumerSecret = handler.retrieveConsumerSecretKey();
        NewUserPage form2;
        if (consumerKey == null || consumerSecret == null) {
            form2 = new NewUserPage();
            form2.setEnabled(true);
            form2.setVisible(true);
        } else {
            form2 = new NewUserPage();
            form2.setEnabled(false);
            form2.setVisible(false);
        }

    }
}
