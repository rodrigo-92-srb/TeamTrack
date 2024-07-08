import Workers.Manager;
import Workers.Operator;
public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator(800001L, "Jack", 30, 168);
        System.out.println("---------- WORKER ----------");
        System.out.println("ID: "+operator.getId());
        System.out.println("Name: "+operator.getName());
        String paymentFormat = String.format("Payment/month: U$ %.2f", +operator.calcPayment());
        System.out.println(paymentFormat);
        System.out.println("----------------------------");


        Manager manager = new Manager(800001L, "John", 10500);
        System.out.println("---------- WORKER ----------");
        System.out.println("ID: "+manager.getId());
        System.out.println("Name: "+manager.getName());
        paymentFormat = String.format("Payment/month: U$ %.2f", +manager.calcPayment());
        System.out.println(paymentFormat);
        System.out.println("----------------------------");
    }
}