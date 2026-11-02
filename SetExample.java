import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void run() {
        Set<Pet> pets = new HashSet<>();

        pets.add(new Pet(1, "собака (Рекс)", 5000.0));
        pets.add(new Pet(2, "кошка (Мурка)", 8000.0));
        pets.add(new Pet(1, "другая собака", 4000.0));

        System.out.println("питомцы: " + pets);
        System.out.println("количество: " + pets.size());

        boolean exists = pets.contains(new Pet(1, "любое имя", 100.0));
        System.out.println("питомец с ID 1 существует: " + exists);

        pets.remove(new Pet(2, "кошка (Мурка)", 8000.0));
        System.out.println("после удаления: " + pets);

        System.out.println("\nвсе питомцы:");
        for (Pet p : pets) {
            System.out.println(p);
        }

        Set<String> categories = new HashSet<>();
        categories.add("собаки");
        categories.add("кошки");
        categories.add("собаки");

        System.out.println("\nвиды питомцев: " + categories);
    }
}