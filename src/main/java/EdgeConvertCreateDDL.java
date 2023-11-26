import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EdgeConvertCreateDDL {
    private static final Logger logger = LogManager.getLogger(EdgeConvertCreateDDL.class);

    public EdgeConvertCreateDDL() {
        logger.debug("EdgeConvertCreateDDL constructor called.");
    }

    public void generateDDL() {
        try {

            logger.info("Generating DDL...");

            //Saving generated DDL to a file
            saveDDLToFile("generated_ddl.sql", "Generated DDL content...");

            logger.info("DDL generation completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred during DDL generation: {}", e.getMessage());
        }
    }

    private void saveDDLToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            logger.info("Generated DDL saved to file: {}", fileName);
        } catch (IOException e) {
            logger.error("Error saving generated DDL to file: {}", e.getMessage());
        }
    }


    public static void main(String[] args) {
        try {
            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            // Load Log4j2 configuration
            System.setProperty("log4j.configurationFile", "/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/resources/log4j2.xml");

            EdgeConvertCreateDDL createDDL = new EdgeConvertCreateDDL();
            createDDL.generateDDL();

            logger.info("Running EdgeConvertCreateDDL...");
            logger.info("EdgeConvertCreateDDL completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
