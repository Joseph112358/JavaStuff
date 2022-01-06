
import java.util.StringJoiner;
//T represents the type (it could be an int,string or yet undefined classes)
 class Pair<T>{
  private final T first;
  private final T second;

  //Setter
  public Pair(T first,T second ){
      this.first = first;
      this.second = second;
  }

  public T getFirst(){
      return first;
  }

  public T getSecond(){
      return second;
  }
  @Override
     public String toString(){
      return new StringJoiner(",", Pair.class.getSimpleName()+"[","]")
              .add("first " + first + " ")
              .add("second " + second + " ")
              .toString();

  }
}

public class Main {

    public static void main(String []args){
        //Strings
        Pair<String> mypair = new Pair("one","two");
        System.out.println(mypair);
        //Integers
        Pair<Integer> intpair = new Pair<>(1,2);
        System.out.println(intpair);

        //Animals!
        Animal sheep = new Animal("Sheep");
        Animal dog = new Animal("Dog");
        Pair<Animal> animalPair = new Pair<>(sheep,dog);
        System.out.println(animalPair);
        //in the animal situation we may want to consider using an interface so we can define how
        //the getString method works, perhaps we may want it to output the animals species.
    }

}

class Animal{
     private String species;
     public Animal(String species){
       this.species = species;
     }
}
