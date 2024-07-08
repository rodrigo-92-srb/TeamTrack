package Workers;

public class Operator extends Worker{

    private int workedHours;
    private double payment;

    public Operator(Long id, String name, double payment, int workedHours) {
        super(id, name);
        this.payment = payment;
        this.workedHours = workedHours;
    }

    @Override
    public double calcPayment(){
        
        return payment*workedHours;
    }

}
