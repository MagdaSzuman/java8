package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Andrzej", "Kowalski", 42);
        Person person2 = new Person("Łukasz", "Nowak", 18);
        Person person3 = new Person("Marek", "Iksiński", 38);
        Person person4 = new Person("Piotr", "Nowacki", 27);
        Person person5 = new Person("Paweł", "Tutaj", 68);
        Person person6 = new Person("Jakub", "Kowal", 13);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);

//        Consumer cons = person -> System.out.println(people);
//        consumeList(people, cons);
//        lub poniżej

        consumeList(people, (person -> System.out.println(people)));
//        consumeList(people, (System.out::println));
//        filterByPredicate(wiek->18);
        System.out.println("================");
        filerByPredicate(people, (person -> person.getAge() > 18));

        System.out.println("================");
        applyToList(people, person -> {
            person.setAge(person.getAge() + 1);
            return person;
        });


    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T object : list) {
            consumer.accept(object);
        }
    }

    static <T> void filerByPredicate(List<T> list, Predicate<T> predicate) {
        for (T object : list) {
            if (predicate.test(object)) {
                System.out.println(object);
            }
        }
    }

    static <T> void applyToList(List<T> list, Function <T, T> function){
        for (int i = 0; i < list.size(); i++) {
            T afterModification = function.apply(list.get(i));
            list.set(i, afterModification);
//            lub list.set(i, function.apply(list.get(i)));
        }
    }
}
