import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EdgeConnector {
    private static final Logger logger = LogManager.getLogger(EdgeConnector.class);


    public EdgeConnector() {
        logger.debug("EdgeConnector constructor called.");
    }
    public void someMethod() {
        logger.info("Executing someMethod in EdgeConnector");
    }

    public static void main(String[] args) {
        try {
            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            // Load Log4j2 configuration
            System.setProperty("log4j.configurationFile", "/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/resources/log4j2.xml");

            EdgeConnector edgeConnector = new EdgeConnector();
            edgeConnector.someMethod();

            logger.info("Running EdgeConnector...");
            logger.info("EdgeConnector completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
