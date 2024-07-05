
public class Duracel extends Battery {

    private double internalVoltage;

    public Duracel(double voltage, double currency, double energy, double internalVoltage) {
        super(voltage, currency, energy);
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower() {
        return (voltage - internalVoltage) * currency;
    }

    @Override
    public double getLifeTime() {
        return energy / getPower();
    }
}