import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EdgeTable {
    private static final Logger logger = LogManager.getLogger(EdgeTable.class);

    private String name;

    public EdgeTable(String name) {
        this.name = name;
        logger.debug("EdgeTable constructor called with name: {}", name);
    }

    public String getName() {
        logger.debug("Getting name: {}", name);
        return name;
    }

    public void setName(String name) {
        logger.debug("Setting name to: {}", name);
        this.name = name;
    }

    public void someMethod() {
        logger.info("Executing someMethod in EdgeTable");
    }
}
