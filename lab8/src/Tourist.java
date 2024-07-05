public class Tourist {
    String name;
    double IncomeMoney;

    public Tourist() {
        this.name = "";
        this.IncomeMoney = 0;
    }
    public Tourist(String name, double IncomeMoney) {
        this.name= name;
        this.IncomeMoney = IncomeMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncomeMoney() {
        return IncomeMoney;
    }

    public void setIncomeMoney(double IncomeMoney) {
        this.IncomeMoney = IncomeMoney;
    }

    public String toString() {
        return "Tourist [name=" + name + ", IncomeMoney=" + IncomeMoney + "]";
    }



}
