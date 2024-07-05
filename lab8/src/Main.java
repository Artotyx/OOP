//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country = new Country("Kazakhstan");
        Country country2 = new Country("Georgia");
        Country country3 = new Country("Madagascar");

        ResortPlace resort1 = new ResortPlace("Shymbulak", "Almaty");
        resort1.addTourist(new Tourist("Ilyas", 200));
        resort1.addTourist(new Tourist("Artoty", 300));
        resort1.addTourist(new Tourist("Ernar", 500));
        resort1.addTourist(new Tourist("Almas", 150));
        resort1.addTourist(new Tourist("Dana", 250));

        ResortPlace resort2 = new ResortPlace("Borovoe", "Kokshetau");
        resort2.addTourist(new Tourist("Narzhakut", 400));
        resort2.addTourist(new Tourist("Diana", 350));
        resort2.addTourist(new Tourist("Aibek", 500));
        resort2.addTourist(new Tourist("Zhanar", 300));
        resort2.addTourist(new Tourist("Ruslan", 200));

        ResortPlace resort3 = new ResortPlace("Rixos", "Astana");
        resort3.addTourist(new Tourist("Aliya", 600));
        resort3.addTourist(new Tourist("Maxat", 450));
        resort3.addTourist(new Tourist("Samal", 300));
        resort3.addTourist(new Tourist("Dias", 550));
        resort3.addTourist(new Tourist("Meru", 400));

        ResortPlace resort4 = new ResortPlace("Kok-Tobe", "Almaty");
        resort4.addTourist(new Tourist("Amina", 700));
        resort4.addTourist(new Tourist("Murat", 800));
        resort4.addTourist(new Tourist("Adil", 900));
        resort4.addTourist(new Tourist("Dana", 1000));
        resort4.addTourist(new Tourist("Yerlan", 650));

        ResortPlace resort5 = new ResortPlace("Zhasybay", "Pavlodar");
        resort5.addTourist(new Tourist("Aisulu", 300));
        resort5.addTourist(new Tourist("Yerzhan", 400));
        resort5.addTourist(new Tourist("Saltanat", 200));
        resort5.addTourist(new Tourist("Aksanat", 350));
        resort5.addTourist(new Tourist("Karlygash", 500));

        country.addResort(resort1);
        country.addResort(resort2);
        country.addResort(resort3);
        country.addResort(resort4);
        country.addResort(resort5);

        ResortPlace resort6 = new ResortPlace("Gudauri", "Tbilisi");
        resort6.addTourist(new Tourist("Nnn", 350));
        resort6.addTourist(new Tourist("Ggg", 400));
        resort6.addTourist(new Tourist("Mmm", 450));
        resort6.addTourist(new Tourist("Lll", 300));
        resort6.addTourist(new Tourist("Sss", 250));

        ResortPlace resort7 = new ResortPlace("Batumi Beach", "Batumi");
        resort7.addTourist(new Tourist("Ttt", 400));
        resort7.addTourist(new Tourist("Ann", 350));
        resort7.addTourist(new Tourist("Bbb", 500));
        resort7.addTourist(new Tourist("Kkk", 300));
        resort7.addTourist(new Tourist("HHH", 450));

        country2.addResort(resort6);
        country2.addResort(resort7);

        ResortPlace resort8 = new ResortPlace("Nosy Be", "Antsiranana");
        resort8.addTourist(new Tourist("Ghfhf", 300));
        resort8.addTourist(new Tourist("Rad", 400));
        resort8.addTourist(new Tourist("Nata", 350));
        resort8.addTourist(new Tourist("JJ", 450));
        resort8.addTourist(new Tourist("V", 500));

        ResortPlace resort9 = new ResortPlace("Ile Sainte-Marie", "Toamasina");
        resort9.addTourist(new Tourist("Z", 250));
        resort9.addTourist(new Tourist("Taddd", 300));
        resort9.addTourist(new Tourist("Hasss", 350));
        resort9.addTourist(new Tourist("Rinnn", 400));
        resort9.addTourist(new Tourist("Fal", 450));

        country3.addResort(resort8);
        country3.addResort(resort9);

        Continent continent = new Continent("Global", 3);
        continent.addCountry(country);
        continent.addCountry(country2);
        continent.addCountry(country3);

        System.out.println("all resort places:");
        country.printAllResorts();

        System.out.println("\nTotal amount of tourists:");
        System.out.println(country.getTotalTourists());

        System.out.println("\nTotal sum of income:");
        System.out.println(country.getTotalIncome());

        System.out.println("\nmax value of total income:");
        System.out.println(country.getResortWithMaxIncome());

        System.out.println("\nrichest tourist:");
        System.out.println(country.getRichestTourist());

        System.out.println("Tot income of countries in cont: ");
        System.out.println(continent.getTotalIncomeOfAllResorts());
        Country mostProfitableCountry = continent.getTheMostProfitableCountry();

        System.out.println("\nMost profitable country in cont:");
        System.out.println(mostProfitableCountry.getName());

        ResortPlace mostProfitableResort = mostProfitableCountry.getResortWithMaxIncome();
        System.out.println("\nMost profitable resort in the most profitable country: ");
        System.out.println(mostProfitableResort);
    }
}