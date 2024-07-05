public abstract class Battery {

    protected double voltage;
    protected double currency;
    protected double energy;

    public Battery(double voltage, double currency, double energy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
    }

    public abstract double getPower();

    public abstract double getLifeTime();
}
