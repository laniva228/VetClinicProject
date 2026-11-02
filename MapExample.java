import java.util.Map;
import java.util.HashMap;

public class MapExample {

    public static void run() {
        Map<Integer, Pet> pets = new HashMap<>();

        pets.put(1, new Pet(1, "собака (Рекс)", 5000.0));
        pets.put(2, new Pet(2, "кошка (Мурка)", 8000.0));

        System.out.println("питомец №1: " + pets.get(1));

        System.out.println("есть ключ 2: " + pets.containsKey(2));

        pets.put(1, new Pet(1, "новая собака", 6000.0));
        System.out.println("после изменения: " + pets.get(1));

        pets.remove(2);

        System.out.println("\nвсе питомцы:");
        for (Map.Entry<Integer, Pet> entry : pets.entrySet()) {
            System.out.println("ключ: " + entry.getKey() + ", значение: " + entry.getValue());
        }

        System.out.println("количество записей: " + pets.size());
    }
}
