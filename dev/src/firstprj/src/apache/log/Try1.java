package org.samples.apache.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;


public class Try1 {

    private static final Log LOG = LogFactory.getLog(Try1.class);

    public static void main(String[] args) {

        LOG.info("new message" + new Date());
        System.out.println("Hello World!888888");


    }
}
