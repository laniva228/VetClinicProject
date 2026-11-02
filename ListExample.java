import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void run() {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(1, "собака (Рекс)", 5000.0));
        pets.add(new Pet(2, "кошка (Мурка)", 8000.0));
        pets.add(new Pet(3, "попугай (Кеша)", 3000.0));

        System.out.println("вывод через get(i):");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }

        System.out.println("\nFor-each:");
        for (Pet p : pets) {
            System.out.println(p);
        }

        System.out.println("\nIterator:");
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        pets.remove(1);
        System.out.println("\nпосле удаления: " + pets);

        Collections.sort(pets, Comparator.comparingDouble(Pet::getPrice));

        System.out.println("\nсортировка по цене приёма:");
        for (Pet p : pets) {
            System.out.println(p);
        }

        System.out.println("\nпоиск питомца кошка (Мурка):");
        for (Pet p : pets) {
            if (p.getName().equals("кошка (Мурка)")) {
                System.out.println(p);
            }
        }

        System.out.println("\nприёмы дороже 4000:");
        for (Pet p : pets) {
            if (p.getPrice() > 4000) {
                System.out.println(p);
            }
        }

        LinkedList<String> history = new LinkedList<>();
        history.add("Кошка (Мурка)");
        history.add("Собака (Рекс)");
        history.addFirst("первый прием");
        history.addLast("последний прием");

        System.out.println("\nLinkedList: " + history);
        System.out.println("первый элемент: " + history.getFirst());

        history.removeFirst();
        System.out.println("после удаления: " + history);
    }
}