package com.ki.xml.example11;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;

public class ResourceDemo {
    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        Resource res3 = ctx.getResource("http://www.baidu.com");
        displayInfo(res3);

        Resource res2 = ctx.getResource("classpath:xml/example11/data.txt");
        displayInfo(res2);

        File file = File.createTempFile("test", ".txt");
        System.out.println(file.getPath());
        Resource res1 = ctx.getResource("file:///" + file.getPath()); //  not 'file://' right is 'file:///'
        displayInfo(res1);
        file.deleteOnExit();

        ctx.close();
    }

    private static void displayInfo(Resource res) throws Exception {
        System.out.println("[" + res.getClass() + "]");
        System.out.println("[" + res.getURL().getContent() + "]");
    }
}
