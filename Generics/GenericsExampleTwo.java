import java.util.StringJoiner;
//generic with two types
class Pair<T,S>{
    private final T first;
    private final S second;

    //Setter
    public Pair(T first,S second ){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }
    @Override
    public String toString(){
        return new StringJoiner(",", Pair.class.getSimpleName()+"[","]")
                .add("first: " + first + " ")
                .add("second: " + second + " ")
                .toString();

    }
}

public class GenericsExampleTwo {

    public static void main(String []args){
        //String and Integer
        Pair<String,Integer> mypair = new Pair("one",5);
        System.out.println(mypair);
        //People
        Pair<Person,Person> people = new Pair(new Person("Joe"),new Person("Jim"));
        Person firstperson = people.getFirst();
        Person secondperson = people.getSecond();
        System.out.println("First person: " + firstperson.getName());
        System.out.println("Second Person: " + secondperson.getName());


    }
}
class Person{
    private final String name;
    public Person(String name){
    this.name = name;
    }
    public String getName(){
        return name;
    }
}


