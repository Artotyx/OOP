public class Continent {
    private String name;
    private Country[] countries;

    public Continent() {
        this.name = "";
        this.countries = new Country[100];
    }

    public Continent(String name, int numberOfCountries) {
        this.name = name;
        this.countries = new Country[numberOfCountries];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country[] getCountries() {
        return countries;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    public void addCountry(Country country) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = country;
                break;
            }
        }
    }

    public double getTotalIncomeOfAllResorts() {
        double totalIncome = 0.0;
        for (Country country : countries) {
            if (country != null) {
                totalIncome += country.getTotalIncome();
            }
        }
        return totalIncome;
    }

    public Country getTheMostProfitableCountry() {
        Country mostProfitableCountry = null;
        double maxIncome = 0.0;
        for (Country country : countries) {
            if (country != null) {
                double countryIncome = country.getTotalIncome();
                if (countryIncome > maxIncome) {
                    maxIncome = countryIncome;
                    mostProfitableCountry = country;
                }
            }
        }
        return mostProfitableCountry;
    }
}