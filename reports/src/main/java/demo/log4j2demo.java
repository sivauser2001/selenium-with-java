package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2demo {

    // Create Logger instance
    private static final Logger log = LogManager.getLogger(log4j2demo.class);

    public static void main(String[] args) {
    	System.out.println("hello world");

        log.info("Application started");
        log.trace("This is a DEBUG message");
        log.debug("debug mode");
        
        System.out.println("completed");
    }
}
