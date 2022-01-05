
interface WaterBottleInterface{
    String color = "Blue";

    void fillup();
    void empty();
}

public class InterfaceExample implements WaterBottleInterface {

    public static void main(String [] args){
        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        ex.fillup();
        ex.empty();
    }

    @Override
    public void fillup() {
      System.out.println("It is filled up");
    }

    @Override
    public void empty() {
      System.out.println("water trickles out the bottle");
    }
}
