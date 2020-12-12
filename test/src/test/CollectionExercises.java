package test;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

class Person {
    String name;
    String lastName;
    Integer age;
    List<String> listOfCars;

    public Person(String name, String lastName, Integer age, List<String> listOfCars) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.listOfCars = listOfCars;
    }

    public List<String> getListOfCars() {
        return listOfCars;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}

public class CollectionExercises {
    static List<Person> getListOfPerson() {
        return Arrays.asList(new Person("Albert", "Smith", 32, Arrays.asList("Volkswagen", "Hyundai", "Suzuki")),
                new Person("Bob", "Michael", 20, Arrays.asList("BMW", "Hyundai", "Volkswagen")),
                new Person("Charlie", "Cohen", 10, Arrays.asList("Mercedes", "Toyota", "BMW")),
                new Person("Charlie", "Mathew", 10, Arrays.asList("Suzuki", "Toyota", "Volkswagen")),
                new Person("Emily", "James", 32, Arrays.asList("Suzuki", "Mercedes", "Hyundai")),
                new Person("Flora", "James", 42, Arrays.asList("Hyundai", "BMW", "Toyota")),
                new Person("Gary", "Luis", 56, Arrays.asList("Mercedes", "Hyundai", "Suzuki")),
                new Person("Henry", "", 29, Arrays.asList("BMW", "Suzuki", "Volkswagen")),
                new Person("Ian", "Smith", 61, Arrays.asList("Mercedes", "Hyundai", "Toyota")),
                new Person("James", "Carlos", 39, Arrays.asList("Suzuki", "Hyundai", "Volkswagen")),
                new Person("Kim", "Liu", 24, Arrays.asList("Toyota", "Mercedes", "Volkswagen"))
        );
    }

    public static void main(String[] args) {
        List<Person> personList = getListOfPerson();

//      [Bob, Charlie, Flora, Henry]
        List<String> getUserByCarNames = personList
                .stream()
                .collect(filtering(person -> person.listOfCars.contains("BMW"),
                        mapping(Person::getName,
                                toList())));
        System.out.println(getUserByCarNames);

//      {32=[Albert, Emily], 20=[Bob], 39=[James], 24=[Kim], 56=[Gary], 42=[Flora], 10=[Charlie, Charlie], 61=[Ian], 29=[Henry]}
        Map<Integer, List<String>> groupUserByAges = personList
                .stream()
                .collect(groupingBy(Person::getAge, mapping(Person::getName,
                        toList())));
        System.out.println(groupUserByAges);

//      [Volkswagen, Toyota, Suzuki, Mercedes, Hyundai, BMW]
        Set<String> getAllDistinctCars = personList
                .stream()
                .collect(flatMapping(person -> person.listOfCars.stream(),
                        toSet()));
        System.out.println(getAllDistinctCars);

//      {Gary=1, Emily=1, James=1, Bob=1, Flora=1, Ian=1, Charlie=2, Albert=1, Kim=1, Henry=1}
        Map<String, Long> getUserCount = personList
                .stream()
                .collect(groupingBy(Person::getName,
                        counting()));
        System.out.println(getUserCount);

//      {Volkswagen=6, Toyota=5, Suzuki=6, Mercedes=5, BMW=4, Hyundai=7}
        Map<String, Long> getTotalCars = personList
                .stream()
                .collect(flatMapping(person -> person.listOfCars.stream(),
                        toList()))
                .stream()
                .collect(groupingBy(Function.identity(),
                        counting()));
        System.out.println(getTotalCars);

//      Hyundai=7
        Map.Entry<String, Long> mostUsedCar = Collections
                .max(personList.stream()
                                .collect(flatMapping(person -> person.listOfCars.stream(),
                                        toList()))
                                .stream()
                                .collect(groupingBy(Function.identity(),
                                        counting()))
                                .entrySet(),
                        Map.Entry.comparingByValue());
        System.out.println(mostUsedCar);

//      BMW=4
        Map.Entry<String, Long> leastUsedCar = Collections
                .min(personList.stream()
                                .collect(flatMapping(person -> person.listOfCars.stream(),
                                        toList()))
                                .stream()
                                .collect(groupingBy(Function.identity(),
                                        counting()))
                                .entrySet(),
                        Map.Entry.comparingByValue());
        System.out.println(leastUsedCar);

//      Ian->61
        Person oldestPerson = personList.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
        System.out.println(Objects.requireNonNull(oldestPerson).getName() + " -> " + oldestPerson.getAge());

//      IntSummaryStatistics{count=11, sum=355, min=10, average=32.272727, max=61}
        IntSummaryStatistics summaryOfAges = personList.stream()
                .collect(summarizingInt(Person::getAge));
        System.out.println(summaryOfAges);

//      true => [Flora, Gary, Ian, James] false => [Albert, Bob, Charlie, Charlie, Emily, Henry, Kim]
        Map<Boolean, List<String>> segregatePersonBasedOnAge = personList.stream()
                .collect(partitioningBy(person -> person.getAge() > 32, mapping(Person::getName, toList())));
        System.out.println(segregatePersonBasedOnAge.get(true));
    }
}
