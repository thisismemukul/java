import java.util.*;

public class SetHashSet {

    public void setHashSetDemo() {
        Set<String> avengers = new HashSet<>();
        avengers.add("Hulk");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        avengers.add("Bucky");
        System.out.println(avengers);
        avengers.remove(0);
        System.out.println(avengers);
        avengers.remove("Bucky");
        System.out.println(avengers);
        avengers.forEach(System.out::println);

        avengers.add("Thor");
        System.out.println("Using iterator to remove duplicates from list");

        Iterator<String> avengersIterator = avengers.iterator();
        while (avengersIterator.hasNext()) {
            System.out.println(avengersIterator.next());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        System.out.println(numbers);
        System.out.println("Iterating numbers ");
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }
        Set<Integer> numbersSet = new HashSet<>(numbers); // or numbersSet.addAll(numbers)
        System.out.println(numbersSet);

        System.out.println("Using a TreeSet");

        Set<String> dcUniverse = new TreeSet<>();
        dcUniverse.add("Batman");
        dcUniverse.add("Superman");
        dcUniverse.add("Flash");
        System.out.println(dcUniverse); // it will print in alpha order and slower then HashSet

        System.out.println("Using a LinkedHashSet");
        LinkedHashSet<String> dcUniverseLinkedHashSet = new LinkedHashSet<>();
        dcUniverseLinkedHashSet.add("Batman");
        dcUniverseLinkedHashSet.add("Superman");
        dcUniverseLinkedHashSet.add("Flash");
        System.out.println(dcUniverseLinkedHashSet); // it will print in insertion order and
    }
}
