
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private TaskConflictNotifier notifier;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        notifier = new TaskConflictNotifier();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        for (Task existingTask : tasks) {
            if (existingTask.overlaps(task)) {
                notifier.notifyObservers("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
                return;
            }
        }
        tasks.add(task);
        notifier.notifyObservers("Task added successfully: " + task);
    }

    public void removeTask(String description) {
        Task toRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                toRemove = task;
                break;
            }
        }
        if (toRemove != null) {
            tasks.remove(toRemove);
            notifier.notifyObservers("Task removed successfully: " + description);
        } else {
            notifier.notifyObservers("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        tasks.sort(Comparator.comparing(Task::getStartTime));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void addObserver(TaskObserver observer) {
        notifier.addObserver(observer);
    }
}
