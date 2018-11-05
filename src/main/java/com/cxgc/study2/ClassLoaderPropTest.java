package com.cxgc.study2;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException{
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("ϵͳ������� " + systemLoader);

        Enumeration<URL> em1 = systemLoader.getResources("");
        while(em1.hasMoreElements()){
            System.out.println(em1.nextElement());
        }

        ClassLoader extensionLader = systemLoader.getParent();
        System.out.println("��չ�������" + extensionLader);
        System.out.println("��չ��������ļ���·��" + System.getProperty("java.ext.dirs"));
        System.out.println("��չ���������parent" + extensionLader.getParent());
    }
}
