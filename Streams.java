package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        // jeśli metoda steam zwraca coś innego niż stream, to jest terminalan
        numbers.stream().forEach(number-> System.out.println(number));
        System.out.println("==================");

//        List<Integer> afterModification = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .peek(number -> System.out.print(number + " "))
//                .map(number -> number * 2)
//                .peek(number -> System.out.print(number + " "))
//                .collect(Collectors.toList()); // do zwrócenia nowej listy

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(System.out::println);
        Integer integer = numbers.stream()
                .filter(number-> number >10)
                .map(number -> number*10)
                .min(Integer::compareTo)
                .get();
        System.out.println(integer);

        List<String>listOfNames = Arrays.asList("Anna", "Justyna", "Karolina", "Zygfryd", "Piotr", "Roman");

        listOfNames.stream()
                .filter(name-> name.length()>=5)
                .map(name->name.toUpperCase())
                .map(name->"@"+name)
                .limit(2)
                .forEach(System.out::println);
    }

// ta lista zostawić ltylko imiona, któr mająwiecej niż 5 liter "(filter)
    // wszystkie do upperCase (do wielkich liter)
// dokleić co każdego imienia "@" z przodu
// ograniczyć listę do dwóch osób i wyświetlić te dwie osoby


}