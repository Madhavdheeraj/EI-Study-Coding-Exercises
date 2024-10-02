import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();

        // Simple console UI
        Scanner scanner = new Scanner(System.in);
        scheduleManager.addObserver(message -> System.out.println(message)); // Logging observer

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Task Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Start Time (HH:MM): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter End Time (HH:MM): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter Priority Level: ");
                    String priority = scanner.nextLine();
                    scheduleManager.addTask(taskFactory.createTask(description, startTime, endTime, priority));
                    break;

                case 2:
                    System.out.print("Enter Task Description to Remove: ");
                    String taskToRemove = scanner.nextLine();
                    scheduleManager.removeTask(taskToRemove);
                    break;

                case 3:
                    scheduleManager.viewTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
