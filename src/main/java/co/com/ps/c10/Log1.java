package co.com.ps.c10;

import java.util.logging.*;


public class Log1 {
    private static final Logger logger = Logger.getLogger(Log1.class.getName());

    public static void main(String[] args) {


        System.out.println("Esto es una traza system");
        logger.setLevel(Level.ALL);


        logger.warning("Este es un mensaje de log de nivel WARNING");
        logger.info("Este es un mensaje de log de nivel INFO");
        logger.config("Este es un mensaje de log de nivel CONFIG");
        logger.fine("Este es un mensaje de log de nivel FINE");
        logger.finer("Este es un mensaje de log de nivel FINER");
        logger.finest("Este es un mensaje de log de nivel FINEST");

        try {

        }catch (NullPointerException e){

            logger.severe("Fallo por un null pointer");
        }




    }
}