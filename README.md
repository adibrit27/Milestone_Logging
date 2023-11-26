## Logging Project
The Logging Project is a Java application demonstrating logging capabilities using the Log4j2 framework. The application parses Edge Diagrammer files, processes the data, and generates logs to illustrate the use of logging across various components.

## Project Structure
EdgeConvertFileParser: Responsible for parsing Edge Diagrammer files.
EdgeConvertCreateDDL: Generates Data Definition Language (DDL) statements based on parsed data.
EdgeConnector: Represents a connector in the diagram.
CreateDDLMySQL: Implements DDL generation specifically for MySQL.
RunEdgeConvert: Main class to execute the EdgeConvert process.
EdgeTable and EdgeField: Represent tables and fields in the diagram.
EdgeConvertGUI: Graphical User Interface for the application.

## How to Run the Project
1. Clone the Repository -  git clone https://github.com/adibrit27/Milestone_Logging.git
2. Run it with your terminal
3. write gradle build in terminal
4. write gradle run in terminal
5. write gradle run 2>&1 | tee console.log

This will execute the RunEdgeConvert class, showcasing the entire process.
