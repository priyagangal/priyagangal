package com.learning.main;


import static com.learning.service.XMLExtractorService.readWebsite;
import static com.learning.service.XMLExtractorService.writeFile;

public class XMLExtractor
{
    public static void main(String [] args) throws Exception {
       String content = readWebsite();
       writeFile(content);
    }

}





