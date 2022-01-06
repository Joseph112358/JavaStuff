

interface Animal{
    public String AnimalSound();
}

 class Pig implements Animal{
    public String AnimalSound(){
        return "Oink";
    }
}
 class Cow implements Animal{
    public String AnimalSound() {
        return "Moo";
    }
}

public class InterfaceExampletwo {

    public static void main(String[] args) {
        Cow cow = new Cow();
        String cowsound = cow.AnimalSound();
        System.out.println("Cow's sound:".concat(cowsound));
        Pig pig = new Pig();
        String pigsound = pig.AnimalSound();
        System.out.println("Pig's sound:".concat(pigsound));


    }
}




