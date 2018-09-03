package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonUp {
    public static void main(String[] args) {
        Person person1 = new Person("Andrzej", "Kowalski", 42);
        Person person2 = new Person("Łukasz", "Nowak", 18);
        Person person3 = new Person("Marek", "Iksiński", 38);
        Person person4 = new Person("Piotr", "Nowacki", 27);
        Person person5 = new Person("Paweł", "Tutaj", 68);
        Person person6 = new Person("Jakub", "Kowal", 53);

        List<Person> people = Arrays.asList(person1, person2, person3, person4, person5, person6);

//        Consumer cons = person -> System.out.println(people);
//        consumeList(people, cons);
//        lub poniżej

        consumeList(people, (person -> System.out.println(people)));
        consumeList(people, (person -> System.out.println(people)));
    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T object: list){
            consumer.accept(object);
        }
    }

}
