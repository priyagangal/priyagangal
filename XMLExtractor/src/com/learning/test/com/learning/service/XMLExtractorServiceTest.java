package com.learning.service;

import junit.framework.TestCase;

import java.io.IOException;

public class XMLExtractorServiceTest extends TestCase {

    XMLExtractorService xmlExtractorService;
    public void testFilewrite() {
        xmlExtractorService.writeFile("test content");
        String content = xmlExtractorService.readFile();
        assertNotNull(content);
    }

    public void testReadWebsite() throws IOException {
        String xml= xmlExtractorService.readWebsite();
        assertNotNull(xml);
    }

}