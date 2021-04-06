package com.mytomcat;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.Random;

public class Test {
    @org.junit.Test
    public void testFile() throws IOException, ClassNotFoundException, DocumentException {
        File file = new File("content/demo.html");
        System.out.println(file.exists());
        FileInputStream inputStream = new FileInputStream(file);
        byte[] buf = new byte[10240];
        int len = inputStream.read(buf);
        System.out.println(new String(buf,0,len));
    }
}
