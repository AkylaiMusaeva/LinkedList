import com.sun.source.tree.CompoundAssignmentTree;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public int compareTo(Person person) {
        //return age-person.getAge();
        //return person.age-getAge();

        //return name.compareTo(person.getName());
       // return person.name.compareTo(getName());

        return 0;
    }
    public static Comparator<Person>sortByAge=new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge()-o2.getAge();
        }
    };

    public static Comparator<Person>sortBYName=new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };



    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
