# FileReaderApp
FileReaderApp is a Java application designed to read and parse data from CSV and XML files. The application processes each file, extracts employee information, saves it in a MySQL database, and moves the processed files to an archive directory. Additionally, the application modifies the path of the file before storing the data.

## Features
- **Supported File Types:** CSV and XML.
- **Data Parsing:** Extracts employee information like roll number, first name, last name, nickname, and marks from files.
- **Database Insertion:** Saves parsed data to a MySQL database using batch processing.
- **File Management:** After the data is successfully inserted into the database, the file is moved to an archive folder.
- **Flexible Design:** Uses a factory pattern to dynamically choose the appropriate parser based on the file type.
## Project Structure
* `reader/`:

  * **CSVFileParser.java:** Reads and parses CSV files.
  * **XmlFileParser.java:** Reads and parses XML files.
  * **IFileReader.java:** Interface that provides a fileParser method for file parsing.
* `to/`:

  * **EmpInfo.java:** A model class representing employee data, including roll number, name, nickname, marks, file name, and file type.
* `utils/`:

  * **DBConnection.java:** Handles MySQL database connection.
  * **StoreDBData.java:** Stores the parsed employee data in the MySQL database and moves files post-processing.
* `FactoryFileReader.java`: Factory class that returns the correct parser (`CSVFileParser` or `XmlFileParser`) based on file type.

* `Main.java`: The entry point of the application where the file processing and database storage occurs.

## Usage
The program works as follows:

1. Choose a file format (CSV or XML).
2. The application parses the employee data.
3. The data is inserted into a MySQL database.
4. The processed file is moved to an archive folder.

## Dependencies
 * Java 8 or higher
 * MySQL 5.7 or higher (for database storage)
 * MySQL JDBC Driver

