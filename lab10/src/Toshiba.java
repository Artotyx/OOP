public class Toshiba extends Battery {

    private double extraEnergy;

    public Toshiba(double voltage, double currency, double energy, double extraEnergy) {
        super(voltage, currency, energy);
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        return (energy + extraEnergy) / getPower();
    }
}