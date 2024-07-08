import Workers.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(800001L, "Jack");
        System.out.println("---------- WORKER ----------");
        System.out.println("ID: "+worker.getId());
        System.out.println("Name: "+worker.getName());
    }
}