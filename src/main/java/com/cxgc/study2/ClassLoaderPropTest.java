package com.cxgc.study2;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException{
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器 " + systemLoader);

        Enumeration<URL> em1 = systemLoader.getResources("");
        while(em1.hasMoreElements()){
            System.out.println(em1.nextElement());
        }

        ClassLoader extensionLader = systemLoader.getParent();
        System.out.println("扩展类加载器" + extensionLader);
        System.out.println("扩展类加载器的加载路径" + System.getProperty("java.ext.dirs"));
        System.out.println("扩展类加载器的parent" + extensionLader.getParent());
    }
}
