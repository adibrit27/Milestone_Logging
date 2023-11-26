import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDDLMySQL {
    private static final Logger logger = LogManager.getLogger(CreateDDLMySQL.class);

    public CreateDDLMySQL() {
        logger.debug("CreateDDLMySQL constructor called.");
    }

    public void generateDDL() {
        try {

            //Generating DLL MySql
            logger.info("Generating MySQL DDL...");

            //Saving generated MySQL DDL to a file
            saveDDLToFile("generated_mysql_ddl.sql", "Generated MySQL DDL content...");

            logger.info("MySQL DDL generation completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred during MySQL DDL generation: {}", e.getMessage());
        }
    }

    private void saveDDLToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            logger.info("Generated MySQL DDL saved to file: {}", fileName);
        } catch (IOException e) {
            logger.error("Error saving generated MySQL DDL to file: {}", e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            // Load Log4j2 configuration
            System.setProperty("log4j.configurationFile", "/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/resources/log4j2.xml");

            CreateDDLMySQL createDDLMySQL = new CreateDDLMySQL();
            createDDLMySQL.generateDDL();

            logger.info("Running CreateDDLMySQL...");

            logger.info("CreateDDLMySQL completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
