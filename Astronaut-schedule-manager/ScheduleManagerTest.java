import java.time.format.DateTimeParseException;

public class ScheduleManagerTest {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();

        // Add an observer to print messages for testing purposes
        scheduleManager.addObserver(message -> System.out.println(message));

        // Positive Test Cases
        System.out.println("---- Positive Test Cases ----");
        try {
            scheduleManager.addTask(taskFactory.createTask("Morning Exercise", "07:00", "08:00", "High"));
            scheduleManager.addTask(taskFactory.createTask("Team Meeting", "09:00", "10:00", "Medium"));
            scheduleManager.viewTasks(); // Should show two tasks in the correct order

            scheduleManager.removeTask("Morning Exercise"); // Remove a task successfully
            scheduleManager.addTask(taskFactory.createTask("Lunch Break", "12:00", "13:00", "Low"));
            scheduleManager.viewTasks(); // Should show remaining tasks after removal
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format detected.");
        }

        // Negative Test Cases
        System.out.println("---- Negative Test Cases ----");
        try {
            // Case 1: Adding a task that overlaps with an existing task
            scheduleManager.addTask(taskFactory.createTask("Training Session", "09:30", "10:30", "High")); // Should produce conflict
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format detected.");
        }

        // Case 2: Removing a non-existent task
        scheduleManager.removeTask("Non-existent Task"); // Should show "Task not found" error

        // Case 3: Adding a task with invalid time format
        try {
            scheduleManager.addTask(taskFactory.createTask("Invalid Time Task", "25:00", "26:00", "Low")); // Invalid time format
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid time format.");
        }

        // Case 4: Adding a task that overlaps with existing tasks
        try {
            scheduleManager.addTask(taskFactory.createTask("Overlap Task", "08:30", "09:30", "Medium")); // Should produce conflict
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format detected.");
        }

        // Case 5: View tasks when no tasks exist (clear all tasks first)
        scheduleManager = ScheduleManager.getInstance(); // Retrieve the singleton instance again
        scheduleManager.viewTasks(); // Should show "No tasks scheduled for the day"
    }
}
