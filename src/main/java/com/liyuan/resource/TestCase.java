package com.liyuan.resource;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class TestCase {
    public static void main(String[] args) throws IOException {
        final Enumeration<URL> urlEnumeration = Thread
                .currentThread()
                .getContextClassLoader()
                .getResources("META-INF/MANIFEST.MF");
        while (urlEnumeration.hasMoreElements()){
            URL jarUrl = urlEnumeration.nextElement();
            System.out.println(jarUrl.toString());
        }
    }
}
