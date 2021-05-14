package census;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");

        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            persons.add(new Person(names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)]));
        }

        long count = persons.stream().filter(age -> age.getAge() < 18).count();

        List<String> recruitsSurnames = persons.stream()
                .filter(age -> age.getAge() > 18)
                .filter(age -> age.getAge() < 27)
                .map(Person::getFamily)
                .collect(Collectors.toList());

        List<Person> workable = persons.stream()
                .filter(person -> person.getEducation().equals(Education.HIGHER))
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getSex().equals(Sex.MAN)? person.getAge() < 65: person.getAge() < 60)
                .sorted(Comparator.comparing(person -> person.getFamily()))
                .collect(Collectors.toList());
    }
}
