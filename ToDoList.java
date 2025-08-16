public class ToDoList {
    private TaskNode head;

    public ToDoList() {
        head = null;
    }

    // Add task to the end
    public void addTask(String title) {
        TaskNode newNode = new TaskNode(title);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added!");
    }

    // Delete task by title
    public void deleteTask(String title) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            System.out.println("Task deleted!");
            return;
        }

        TaskNode current = head;
        TaskNode prev = null;

        while (current != null && !current.title.equalsIgnoreCase(title)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task deleted!");
        }
    }

    // Print all tasks
    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Your Tasks:");
        TaskNode current = head;
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
    }

    // Search for a task
    public boolean contains(String title) {
        TaskNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
