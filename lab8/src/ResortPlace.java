public class ResortPlace {
    String name;
    String city;
    Tourist tourists[] = new Tourist[1000];
    int touristCount=0;

    public ResortPlace(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addTourist(Tourist tourist) {
        if (touristCount < tourists.length) {
            tourists[touristCount] = tourist;
            touristCount++;
        }

    }

    public double getTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < touristCount; i++) {
            totalIncome += tourists[i].getIncomeMoney();
        }
        return totalIncome;
    }

    public int getTotalTourists() {
        return touristCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resort Place: ").append(name).append(", City: ").append(city).append("\n");
        sb.append("_____________\n");
        sb.append("Tourists:\n");
        for (int i = 0; i < touristCount; i++) {
            sb.append(tourists[i].toString()).append("\n");
        }
        sb.append("_____________\n");
        sb.append("Total Income: ").append(getTotalIncome()).append(" USD\n");
        return sb.toString();
    }
}


