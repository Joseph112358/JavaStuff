public class Enums {

        public static void main(String args[]){
            System.out.println("Hello world again");

            CupSize cup = CupSize.MEDIUM;

            Coffee coffee = new Coffee(cup);
            System.out.println(coffee.getCupSize());
            System.out.println("Volume is: " + coffee.getCupSize().getVolume());

        }


}
class Coffee {
    private CupSize cupSize;

    public Coffee(){};

    public Coffee(CupSize cupSize){
        this.cupSize = cupSize;
    }

    public void setCupSize(CupSize cupSize){
        this.cupSize = cupSize;
    }

    public CupSize getCupSize(){
        return cupSize;
    }
}
 enum CupSize {
    SMALL(25),
    MEDIUM(40),
    LARGE(110);

    private int volume;

    CupSize(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
}

