import Workers.Operator;
public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator(800001L, "Jack", 30, 168);
        System.out.println("---------- WORKER ----------");
        System.out.println("ID: "+operator.getId());
        System.out.println("Name: "+operator.getName());
        String paymentFormat = String.format("Payment/month: U$ %.2f", +operator.calcPayment());
        System.out.println("Payment/month: U$ " +paymentFormat);
    }
}