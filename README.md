# Astronaut Daily Schedule Organizer

## Overview
The **Astronaut Daily Schedule Organizer** is a console-based application that helps astronauts organize their daily schedules. The application allows users to add, remove, and view daily tasks with descriptions, start times, end times, and priority levels. It demonstrates the use of multiple design patterns such as **Singleton**, **Factory**, and **Observer** to create a structured and maintainable project.

## Design Patterns Implemented
1. **Singleton Pattern**: 
   - Used to create a single instance of the `ScheduleManager` class to manage all tasks.
2. **Factory Pattern**:
   - Implemented in the `TaskFactory` class to create `Task` objects based on user inputs.
3. **Observer Pattern**:
   - Implemented through `TaskObserver` and `TaskConflictNotifier` to notify users of task conflicts or updates.


### File Descriptions

1. **`Main.java`**: 
   - Entry point for the application. Contains the main menu and user interaction logic for adding, removing, and viewing tasks.

2. **`ScheduleManager.java`**: 
   - A singleton class responsible for managing all the tasks. It ensures that there is only one instance of the manager and handles all task operations such as adding, removing, and viewing tasks.

3. **`Task.java`**: 
   - Represents a task with attributes like `description`, `startTime`, `endTime`, and `priority`. It contains methods for checking if tasks overlap and displaying task details.

4. **`TaskFactory.java`**: 
   - A factory class used to create `Task` objects. This class simplifies object creation and allows for extending or modifying the way tasks are created without affecting client code.

5. **`TaskObserver.java`**: 
   - An observer interface used for implementing the observer pattern. Any class implementing this interface can be notified of task updates or conflicts.

6. **`TaskConflictNotifier.java`**: 
   - A concrete observer class that notifies users of conflicts between tasks. It manages a list of observers and notifies them whenever a conflict or update occurs.

7. **`ScheduleManagerTest.java`**: 
   - A test class to validate the functionality of the application, ensuring that tasks can be added, removed, and viewed, and that conflicts are detected appropriately.

## How to Run the Application

1. **Clone the Repository**:
   - Clone the repository to your local machine using the following command:
     ```
     git clone https://github.com/your-username/astronaut-schedule-manager.git
     ```
2. **Compile and Run**:
   - Compile the Java files:
     ```
     javac src/main/java/com/schedulemanager/*.java
     ```
   - Run the `Main` class:
     ```
     java -cp src/main/java com.schedulemanager.Main
     ```
3. **Using an IDE**:
   - Import the project into an IDE like IntelliJ IDEA or Eclipse.
   - Run the `Main.java` file as a Java application.

## How to Run Tests

If using Maven, you can run the tests using:

```bash
mvn test
