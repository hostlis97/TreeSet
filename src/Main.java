import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Андрей", "Иванов", 10));
        personList.add(new Person("Алексей", "Иванов-Петров", 10));
        personList.add(new Person("Екатерна", "Орлова-Храченко-Гринюк", 15));
        personList.add(new Person("Ольга", "Иванова-Андреева-Колесник-Лапина", 20));
        personList.add(new Person("Борис", "Иванов-Петров", 30));

        for (Person person : personList) {
            System.out.println(person);
            person.countWordsSurame();
        }
        System.out.println("Sort");
        Comparator<Person> comporator = (o1, o2) -> {
            if (o1.countWordsSurame() < o2.countWordsSurame()) {
                return -1;
            } else if (o1.countWordsSurame() > o2.countWordsSurame()) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        personList.sort(comporator);
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
