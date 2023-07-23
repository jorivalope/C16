package co.com.ps.c10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log3 {

    private static final Logger logger = LoggerFactory.getLogger(Log3.class);

    public static void main(String[] args) {
        logger.error("Este es un mensaje de log de nivel ERROR");
        logger.warn("Este es un mensaje de log de nivel WARN");
        logger.info("Este es un mensaje de log de nivel INFO");
        logger.debug("Este es un mensaje de log de nivel DEBUG");
        logger.trace("Este es un mensaje de log de nivel TRACE");
    }
}