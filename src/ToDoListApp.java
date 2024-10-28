import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    Scanner scanner;
    ArrayList<String> toDoList = new ArrayList<String>();

    public ToDoListApp(Scanner scan) {
        scanner = scan;
    }

    void addTask() {
        System.out.println("Введите задачу для планирования: ");
        String task = scanner.next();
        toDoList.add(task);
    }

    void showTasks() {
        System.out.println("Список запланированных дел: ");
        if (!toDoList.isEmpty()) {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }else {
            System.out.println("Нет запланированных дел.");
        }

    }

    void deleteTask() {
        System.out.println("Список запланированных дел: ");
        showTasks();
        System.out.println("Введите номер задачи для удаления: ");
        int number = scanner.nextInt();
        if (number <= toDoList.size()) {
            toDoList.remove(number - 1);
        } else {
            System.out.println("Некорректный номер.");
        }
    }

}
