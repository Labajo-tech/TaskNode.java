import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String addTitle = scanner.nextLine();
                    toDoList.addTask(addTitle);
                    break;

                case 2:
                    System.out.print("Enter task title to delete: ");
                    String delTitle = scanner.nextLine();
                    toDoList.deleteTask(delTitle);
                    break;

                case 3:
                    toDoList.printTasks();
                    break;

                case 4:
                    System.out.print("Enter task title to search: ");
                    String searchTitle = scanner.nextLine();
                    if (toDoList.contains(searchTitle)) {
                        System.out.println("Task found!");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
