import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunEdgeConvert {
    private static final Logger logger = LogManager.getLogger(RunEdgeConvert.class);

    public static void main(String[] args) {
        try {
            // Basic log configuration
            System.setProperty("logFilename", "logs/app.log");

            // Load Log4j2 configuration
            System.setProperty("log4j.configurationFile", "path/to/log4j2.xml");

            // Initialize and run EdgeTable
            EdgeTable edgeTable = new EdgeTable("SampleTable");
            edgeTable.setName("UpdatedTableName");

            logger.info("EdgeTable Name: {}", edgeTable.getName());

            // Initialize and run EdgeField
            EdgeField edgeField = new EdgeField("SampleField");
            edgeField.setName("UpdatedFieldName");

            logger.info("EdgeField Name: {}", edgeField.getName());

            // Initialize and run EdgeConvertGUI
            EdgeConvertGUI edgeConvertGUI = new EdgeConvertGUI();
            edgeConvertGUI.someMethod();

            // Initialize and run EdgeConvertFileParser
            EdgeConvertFileParser fileParser = new EdgeConvertFileParser();
            fileParser.parseFile("/Users/khoiruladib/Documents/RIT/AplicationDev/Kelompok/Log/src/main/java/Courses.edg");

            // Initialize and run EdgeConvertCreateDDL
            EdgeConvertCreateDDL createDDL = new EdgeConvertCreateDDL();
            createDDL.generateDDL();

            // Initialize and run EdgeConnector
            EdgeConnector edgeConnector = new EdgeConnector();
            edgeConnector.someMethod();

             // Initialize and run CreateDDLMySQL
             CreateDDLMySQL createDDLMySQL = new CreateDDLMySQL();
             createDDLMySQL.generateDDL();

             

            logger.info("Running...");
            logger.info("RunEdgeConvert completed successfully.");

        } catch (Exception e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
