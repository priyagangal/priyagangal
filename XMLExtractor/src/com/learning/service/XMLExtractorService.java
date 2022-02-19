package com.learning.service;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class XMLExtractorService {
    public static void writeFile(String content){

        try {
            FileWriter writer = new FileWriter("webContent.txt", false);
              BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(content);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String readFile() {

        try {
            FileReader reader = new FileReader("webContent.txt");
            int  character;

            StringBuilder sb = new StringBuilder();
            while ((character = reader.read()) != -1) {
                char character1 = (char) character;
                sb.append(character1);
                System.out.print(character1);
            }
            reader.close();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readWebsite() throws IOException {
        URL url;
        url = new URL("http://www.google.com/");
        //Retrieving the contents of the specified page
        Scanner sc = new Scanner(url.openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.next()+" ");
        }
        //Retrieving the String from the String Buffer object
        String result = sb.toString();
        //Removing the HTML tags
        result=result.replace("><",">\n<");
        System.out.println("XML content of website: "+url+ " is :" + result);
        return  result;

    }

}

