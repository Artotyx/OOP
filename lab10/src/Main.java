public class Main {

    public static void main(String[] args) {

        Toshiba toshiba1 = new Toshiba(3.7, 2, 10000, 2000);
        Toshiba toshiba2 = new Toshiba(3.7, 1.5, 8000, 1500);
        Toshiba toshiba3 = new Toshiba(3.7, 2.1, 12000, 1000);
        Toshiba toshiba4 = new Toshiba(3.7, 1.0, 5000, 1200);
        Toshiba toshiba5 = new Toshiba(3.7, 2.2, 8000, 3000);

        Duracel duracel1 = new Duracel(1.5, 1, 5000, 0.1);
        Duracel duracel2 = new Duracel(1.2, 0.8, 3500, 0.2);
        Duracel duracel3 = new Duracel(1.4, 0.4, 3500, 0.6);
        Duracel duracel4 = new Duracel(1.8, 0.5, 9000, 0.5);
        Duracel duracel5 = new Duracel(1.0, 0.6, 3200, 0.3);


        FlashLight flashlight1 = new FlashLight(new Battery[]{toshiba1, duracel1});
        FlashLight flashlight2 = new FlashLight(new Battery[]{toshiba2, duracel2});
        FlashLight flashlight3 = new FlashLight(new Battery[]{toshiba3, duracel3});
        FlashLight flashLight4 = new FlashLight(new Battery[]{toshiba4, duracel4});
        FlashLight flashLight5 = new FlashLight(new Battery[]{toshiba5, duracel5});

        System.out.println("Flashlight lifetime:");
        for (FlashLight flashlight : new FlashLight[]{flashlight1,
                flashlight2, flashlight3,
                flashLight4, flashLight5}) {
            System.out.println(flashlight.getTotalLifeTime());
        }


        FlashLight maxLifeTimeFlashlight = flashlight1;
        for (FlashLight flashlight : new FlashLight[]{
                flashlight2, flashlight3,
                flashLight4, flashLight5}) {
            if (flashlight.getTotalLifeTime() > maxLifeTimeFlashlight.getTotalLifeTime()) {
                maxLifeTimeFlashlight = flashlight;
            }
        }

        System.out.println("\nFlashlight with max lifetime:");
        System.out.println("TotPower: " + maxLifeTimeFlashlight.getTotalPower());
        System.out.println("TotEnergy: " + maxLifeTimeFlashlight.getTotalEnergy());
        System.out.println("TotLifetime: " + maxLifeTimeFlashlight.getTotalLifeTime());
    }
}