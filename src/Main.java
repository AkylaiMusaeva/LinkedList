import java.util.*;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> odds=new LinkedList<>();
        LinkedList<Integer> evens=new LinkedList<>();
        LinkedList<Integer> numbers=new LinkedList<>(List.of(7,18,26,1,0,9,15,14));
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                odds.add(numbers.get(i));
            }else{
                evens.add(numbers.get(i));
            }
        }
        System.out.println(numbers);
        System.out.println(odds);
        System.out.println(evens);

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Js");
        arrayList.add("Python");
        arrayList.add("C++");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Integer> integers=new ArrayList<>(List.of(13321,14,45,25,1,68));
        Collections.sort(integers);
        System.out.println(integers);


        ArrayList<Person>people=new ArrayList<>(List.of(new Person("Abubakir",20),
                new Person("Eldan",18),
                new Person("Bael",64)));
//        Collections.sort(people);
//        System.out.println(people);



     //   SortByAge sortByAge=new SortByAge();
     //   sortByName sortByName=new sortByName();
        //   people.sort(Person.sortByAge);
        people.sort(Person.sortBYName);
      //  people.sort(sortByName);
        System.out.println(people);





    }
}