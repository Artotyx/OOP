public class Country {
    private String name;
    private ResortPlace[] resortPlaces = new ResortPlace[1000];
    private int resortCount = 0;

    public Country() {
        this.name = "";
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addResort(ResortPlace resort) {
        if (resortCount < resortPlaces.length) {
            resortPlaces[resortCount] = resort;
            resortCount++;
        }
    }

    public void printAllResorts() {
        for (int i = 0; i < resortCount; i++) {
            System.out.println(resortPlaces[i].getName());
        }
    }

    public double getTotalIncome() {
        double totalIncome = 0.0;
        for (int i = 0; i < resortCount; i++) {
            totalIncome += resortPlaces[i].getTotalIncome();
        }
        return totalIncome;
    }

    public int getTotalTourists() {
        int totalTourists = 0;
        for (int i = 0; i < resortCount; i++) {
            totalTourists += resortPlaces[i].getTotalTourists();
        }
        return totalTourists;
    }

    public ResortPlace getResortWithMaxIncome() {
        ResortPlace maxIncomeResort = null;
        double maxIncome = 0.0;
        for (int i = 0; i < resortCount; i++) {
            double income = resortPlaces[i].getTotalIncome();
            if (income > maxIncome) {
                maxIncome = income;
                maxIncomeResort = resortPlaces[i];
            }
        }
        return maxIncomeResort;
    }

    public Tourist getRichestTourist() {
        Tourist richestTourist = null;
        double maxIncome = 0.0;
        for (int i = 0; i < resortCount; i++) {
            for (int j = 0; j < resortPlaces[i].getTotalTourists(); j++) {
                if (resortPlaces[i].tourists[j].getIncomeMoney() > maxIncome) {
                    maxIncome = resortPlaces[i].tourists[j].getIncomeMoney();
                    richestTourist = resortPlaces[i].tourists[j];
                }
            }
        }
        return richestTourist;
    }
}
