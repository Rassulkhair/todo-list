import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListApp toDoListApp = new ToDoListApp(scanner);
        while (true) {
            System.out.println("""
                    1) Добавить задачу;
                    2) Вывести список задач;
                    3) Удалить задачу;
                    0) выйти из приложения.""");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> toDoListApp.addTask();
                case 2 -> toDoListApp.showTasks();
                case 3 -> toDoListApp.deleteTask();
                case 0 -> {
                    System.out.println("Выход из программы...");
                    return;
                }
            }
        }
    }
}