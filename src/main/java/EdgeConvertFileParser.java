import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EdgeConvertFileParser {
    private static final Logger logger = LogManager.getLogger(EdgeConvertFileParser.class);


    public EdgeConvertFileParser() {
        logger.debug("EdgeConvertFileParser constructor called.");
    }

    public void parseFile(String filePath) {
        try {
            logger.info("Parsing file: {}", filePath);

            saveParsedDataToFile("parsed_data.txt", "Parsed data content...");

            logger.info("File parsing completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred during file parsing: {}", e.getMessage());
        }
    }

    private void saveParsedDataToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            logger.info("Parsed data saved to file: {}", fileName);
        } catch (IOException e) {
            logger.error("Error saving parsed data to file: {}", e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {

            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            //Log4j2 configuration
            System.setProperty("log4j.configurationFile", "/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/resources/log4j2.xml");

            EdgeConvertFileParser fileParser = new EdgeConvertFileParser();
            fileParser.parseFile("/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/java/Courses.edg");

            logger.info("Running EdgeConvertFileParser...");
            logger.info("EdgeConvertFileParser completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
