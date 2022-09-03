import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Predicate<Person> predicate = person -> person.getAge() < 18;

        personList.add(new Person("Андрей", "Иванов", 10));
        personList.add(new Person("Алексей", "Иванов-Петров", 10));
        personList.add(new Person("Екатерна", "Орлова-Храченко-Гринюк", 15));
        personList.add(new Person("Ольга", "Иванова-Андреева-Колесник-Лапина", 20));
        personList.add(new Person("Борис", "Иванов-Петров", 30));

        for (Person person : personList) {
            System.out.println(person);
            person.countWordsSurame();
        }

        personList.removeIf(predicate);
        System.out.println("Sort");
        Collections.sort(personList, new PersonComparator());
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
