package org.samples.apache;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileNotFoundException;


public class Logging {

    private static final Log log = LogFactory.getLog(Logging.class.getName());
    //LogFactory.getLog(Logging.class);

    public static void main(String[] args) throws FileNotFoundException {

        log.debug("Sample debug message");
        log.info("Sample info message");
        log.warn("Sample warn message");
        log.fatal("Sample fatal message");
        log.error("Sample error message");

       /* ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
            System.out.println(url.getFile());
        }*/


        System.out.print(System.getProperty("user.dir"));

    }
}
