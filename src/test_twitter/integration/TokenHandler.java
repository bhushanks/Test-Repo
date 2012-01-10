/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_twitter.integration;

import java.io.*;

public class TokenHandler {

    public void createFile() throws IOException {
        File file;
        file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        
        file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2secret.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
       
         file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerKey.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        
         file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerSecret.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

    }

    public void storeToken(String token) {
        try {
            BufferedWriter writer = null;
            File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2.txt");
            if (!file.exists()) {
                System.out.println("File not found");
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2.txt"));
            writer.write(token);
            writer.close();
        } catch (IOException ex) {
            System.out.print(ex);
        }
    }
    
    public void storeConsumerKey(String consumerKey) throws IOException {
        
            BufferedWriter writer = null;
            File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerKey.txt");
            if (!file.exists()) {
                System.out.println("File not found");
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerKey.txt"));
            writer.write(consumerKey);
            writer.close();
        
    }
    
    public void storeConsumerSecretKey(String consumerSecretKey) throws IOException {
        
            BufferedWriter writer = null;
            File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerSecret.txt");
            if (!file.exists()) {
                System.out.println("File not found");
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerSecret.txt"));
            writer.write(consumerSecretKey);
            writer.close();
        
    }
    

    public void storeTokenSecret(String tokenSecret) {
        try {
            BufferedWriter writer = null;
            File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2secret.txt");
            if (!file.exists()) {
                System.out.println("File not found");
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter("/Users/BhushanSukumar/NetBeansProjects/Test_Twitter Integration/lib/tokens2secret.txt"));
            writer.write(tokenSecret);
            writer.close();

        } catch (IOException ex) {
            System.out.print(ex);
        }
    }

    public String retrieveToken() throws FileNotFoundException, IOException {
        String token = null;
        File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2.txt");
        if (!file.exists()) {
            System.out.println("File not found");
        } else {
            FileInputStream fin = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fin);
            DataInputStream dis = new DataInputStream(bis);
            token = dis.readLine();
            fin.close();
            bis.close();
            dis.close();
        }
        return token;
    }

    public String retrieveTokenSecret() throws FileNotFoundException, IOException {
        String tokenSecret = null;
        File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/tokens2secret.txt");
        if (!file.exists()) {
            System.out.println("File not found");
        } else {
            FileInputStream fin = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fin);
            DataInputStream dis = new DataInputStream(bis);
            tokenSecret = dis.readLine();
            fin.close();
            bis.close();
            dis.close();
        }
        return tokenSecret;
    }
    
    public String retrieveConsumerSecretKey() throws FileNotFoundException, IOException {
        String consumerSecret = null;
        File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerSecret.txt");
        if (!file.exists()) {
            System.out.println("File not found");
        } else {
            FileInputStream fin = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fin);
            DataInputStream dis = new DataInputStream(bis);
            consumerSecret = dis.readLine();
            fin.close();
            bis.close();
            dis.close();
        }
        return consumerSecret;
    }
    
    public String retrieveConsumerKey() throws FileNotFoundException, IOException {
        String consumerKey = null;
        File file = new File("/Users/NetBeansProjects/Test_Twitter Integration/lib/consumerKey.txt");
        if (!file.exists()) {
            System.out.println("File not found");
        } else {
            FileInputStream fin = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fin);
            DataInputStream dis = new DataInputStream(bis);
            consumerKey = dis.readLine();
            fin.close();
            bis.close();
            dis.close();
        }
        return consumerKey;
    }
}
