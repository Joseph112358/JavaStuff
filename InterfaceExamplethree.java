
//use more than 1 interface
interface Plane{
  public String PlaneSound();
}
interface Car{
 public String CarSound();
}

class Batmobile implements Car,Plane{

    public String CarSound() {
        return "Vrrrr";
    }
    public String PlaneSound(){
        return "nnneeaoowww";
    }
}

public class InterfaceExamplethree {

    public static void main(String[] args) {
        Batmobile batmobile = new Batmobile();
        String planesound = batmobile.PlaneSound();
        String carsound = batmobile.CarSound();
        System.out.println("Driving:".concat(carsound) + ".  Flying:".concat(planesound));
    }
}




