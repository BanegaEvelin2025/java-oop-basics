public class Main {

    public static void main(String[] args) {

        Task task1 = new Task("Learn Java OOP");
        Task task2 = new Task("Create GitHub project");

        task1.markAsCompleted();

        System.out.println(task1.getTitle() + " - completed: " + task1.isCompleted());
        System.out.println(task2.getTitle() + " - completed: " + task2.isCompleted());
    }
}
