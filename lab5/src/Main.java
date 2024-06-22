import lab5.Animal;
import lab5.AnimalArrayList;
import lab5.Cat;
import lab5.Dog;

public class Main {
    public static void main(String[] args) {
        AnimalArrayList animalArrayList = new AnimalArrayList(30);
        Animal cat = new Cat("Markiz");
        Animal dog = new Dog("Baron");
        animalArrayList.add(cat);
        animalArrayList.add(dog);
        System.out.println(animalArrayList.get(1));
        Animal newDog = new Dog("Reks");
        animalArrayList.set(1, newDog);
        for (int i = 0; i < animalArrayList.size(); i++) {
            Animal currentAnimal = animalArrayList.get(i);
            System.out.println("Animal " + currentAnimal.getName() + " says ");
            currentAnimal.sound();

        }

        animalArrayList.clear();
    }
}
