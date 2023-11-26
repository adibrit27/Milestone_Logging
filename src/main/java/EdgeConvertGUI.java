import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EdgeConvertGUI {
    private static final Logger logger = LogManager.getLogger(EdgeConvertGUI.class);

    public EdgeConvertGUI() {
        logger.debug("EdgeConvertGUI constructor called.");
    }

    public void someMethod() {
        logger.info("Executing someMethod in EdgeConvertGUI");
    }


    public static void main(String[] args) {
        try {
            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            // Load Log4j2 configuration
            System.setProperty("log4j.configurationFile", "/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/resources/log4j2.xml");

            EdgeConvertGUI edgeConvertGUI = new EdgeConvertGUI();
            edgeConvertGUI.someMethod();


            logger.info("Running EdgeConvertGUI...");
            logger.info("EdgeConvertGUI completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
