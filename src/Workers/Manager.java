package Workers;

public class Manager extends Worker{

    private double payment;

    public Manager(Long id, String name, double payment) {
        super(id, name);
        this.payment = payment;
    }

    @Override
    public double calcPayment() {
        return payment;
    }
}
