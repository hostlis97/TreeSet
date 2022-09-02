import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.countWordsSurame() < o2.countWordsSurame()) {
            return -1;
        } else if (o1.countWordsSurame() > o2.countWordsSurame()) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
