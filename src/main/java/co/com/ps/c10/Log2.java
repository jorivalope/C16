package co.com.ps.c10;

import org.apache.log4j.*;

public class Log2 {
    private static final Logger logger = Logger.getLogger(Log2.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.error("Este es un mensaje de log de nivel ERROR");
        logger.warn("Este es un mensaje de log de nivel WARN");
        logger.info("Este es un mensaje de log de nivel INFO");
        logger.debug("Este es un mensaje de log de nivel DEBUG");
        logger.trace("Este es un mensaje de log de nivel TRACE");
    }
}