# Hotel Management System

The **Hotel Management System** is a comprehensive Java-based application designed to streamline and automate hotel operations. It assists hotel administrators and staff in managing various aspects of hotel operations efficiently.

## Prerequisites

Before you begin, ensure you have the following:

- **Java Development Kit (JDK):** Install the latest version. This project was developed with [JDK 21](https://www.oracle.com/java/technologies/javase-downloads.html) (Oracle) or [AdoptOpenJDK](https://adoptopenjdk.net/).

- **IDE:** While any IDE will work, [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) is recommended for this project.

- **MySQL Connector:** Download [MySQL Connector/J version 8.0.28](https://dev.mysql.com/downloads/connector/j/) or later.

- **rs2xml:** Obtain the latest version of the `rs2xml` library for converting ResultSet to TableModel.

## Resources

Access all necessary resources, including icons, database files (`databasefile.txt`), `jcalender` JAR file, and `mysql-connector` JAR file here:

[Project Resources](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)

## Acknowledgements

Special thanks to the creator of the YouTube playlist ["Hotel Management System in Java"](https://www.youtube.com/watch?v=pMR_48AF-A0&list=PL_6klLfS1WqE1-_MJgZiJqAaccjLGHh0H&index=1&t=0s) for providing an excellent step-by-step guide that significantly aided the development of this project.

## Project Structure

This project is organized into several `.java` class files, each with a specific role:

- **AddCustomer.java:** Handles the addition of new customers.
- **AddDriver.java:** Manages the addition of new drivers.
- **AddEmployee.java:** Manages the addition of new employees.
- **AddRooms.java:** Facilitates the addition of new rooms.
- **Checkout.java:** Manages the checkout process for customers.
- **Conn.java:** Establishes the MySQL database connection.
- **CustomerInfo.java:** Displays customer information.
- **Dashboard.java:** Provides an overview for the admin or manager.
- **Department.java:** Manages different hotel departments.
- **EmployeeInfo.java:** Displays employee information.
- **Login.java:** Handles user login functionality.
- **ManagerInfo.java:** Displays manager information.
- **Pickup.java:** Manages driver status (available or on duty).
- **Reception.java:** Handles reception-related functions.
- **SearchRoom.java:** Checks room availability.
- **UpdateRoom.java:** Updates room status after check-in or checkout.

## Documentation

### Set Up the Environment

1. **Install JDK 21 or AdoptOpenJDK:**
  - Download and install [JDK 21](https://www.oracle.com/java/technologies/javase-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/).

2. **Install IntelliJ IDEA or another IDE of your choice:**
  - Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) or another preferred IDE.

### Configure Database

1. **Import the `databasefile.txt` into your MySQL database:**
  - Use your MySQL client or command-line tool to import the `databasefile.txt` file into your MySQL database.

2. **Update the database connection details in `Conn.java` to match your setup:**
  - Open `Conn.java` and modify the database URL, username, and password according to your MySQL setup.

### Add Dependencies

1. **Ensure that `mysql-connector.jar`, `jcalender.jar`, and `rs2xml.jar` are added to your project’s classpath:**
  - Download the required JAR files.
  - Add `mysql-connector.jar`, `jcalender.jar`, and `rs2xml.jar` to your project's classpath in your IDE.

### Configuration

1. **Database Configuration:**
  - Configure the database URL, username, and password in `Conn.java` to ensure proper connection to your MySQL database.

2. **Application Configuration:**
  - No additional application configuration is required beyond setting up the database connection.

### Usage Instructions

1. **Starting the Application:**
  - Open the project in your IDE.
  - Run the `Dashboard.java` file to start the application.

2. **Basic Features:**
  - **Add Customer:** Navigate to the "Add Customer" section to input new customer details.
  - **Manage Rooms:** Use the "Add Rooms" and "Update Rooms" features to manage room availability.
  - **Check-In/Check-Out:** Use the "Check-Out" section to process customer departures.

3. **Navigating the Interface:**
  - **Dashboard:** Provides an overview of the system’s main features.
  - **Reception:** Handles check-ins, check-outs, and room management.

### Code Structure

- **AddCustomer.java:** Handles customer additions.
- **Conn.java:** Manages database connections.
- **Dashboard.java:** Main interface for the admin.

### Troubleshooting

1. **Issue:** Unable to connect to the MySQL database.
  - **Solution:** Check `Conn.java` for correct database settings and ensure MySQL is running.

2. **Issue:** JAR files not found.
  - **Solution:** Verify that all required JAR files (`mysql-connector.jar`, `jcalender.jar`, `rs2xml.jar`) are in your classpath.

### Contributing

- **Submitting Issues:** Report bugs or request features via [GitHub Issues](https://github.com/Rishy-09/Hotel-Management-System/issues).

## Appendix

### Additional Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [IntelliJ IDEA Documentation](https://www.jetbrains.com/idea/documentation/)

### Troubleshooting

- **Issue:** Unable to connect to the MySQL database.
  - **Solution:** Check `Conn.java` for correct database URL, username, and password. Ensure MySQL is running and accessible.

- **Issue:** JAR files not found during runtime.
  - **Solution:** Confirm that `mysql-connector.jar`, `jcalender.jar`, and `rs2xml.jar` are in your project's classpath.

### Glossary

- **JAR (Java ARchive):** A file format aggregating multiple files into a single archive for Java applications or libraries.
- **IDE (Integrated Development Environment):** Software providing comprehensive facilities for software development.

### Change Log

- **v1.0.0:** Initial release of the Hotel Management System.
- **v1.1.0:** Added room search and update functionality.
- **v1.2.0:** Improved database connectivity and error handling.

### Future Work

- Integration with online payment systems.
- Development of a mobile app interface for easier hotel management.

## Authors

- [@Rishy-09](https://github.com/Rishy-09) - Main developer of the project inspired from [@kunaltyagi9](https://github.com/kunaltyagi9)

Special thanks to the open-source community for their support and inspiration.
