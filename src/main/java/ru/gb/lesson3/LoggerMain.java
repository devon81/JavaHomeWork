package ru.gb.lesson3;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMain {

    static Logger logger = Logger.getLogger(LoggerMain.class.getName());

    public static void main(String[] args) {
        // log4j, log4j2, logback
        // slf4j simple logging facade for java
        // slf4j(log4j), slf4j(logback), slf4j(java.util.Logging)

        // FATAL, ERROR, WARN, INFO, DEBUG, TRACE

        for (Handler handler : logger.getHandlers()) {
            handler.setLevel(Level.FINE);
        }
        Filter filter = logger.getFilter();
        logger.setLevel(Level.FINE);


        logger.log(Level.FINE, "error");


        // logger(level, message) ->

    }

}
