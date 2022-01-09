class A{
   public void showData(){
     System.out.println("Data A");
   }
}

class B extends A{
    @Deprecated //tells us this method is no longer in use
    public void show(){
      System.out.println("Showing");
    }
    //Tells us we are overiding a method
    //if we aren't, will throw an error (prevents runtime errors)
    @Override
  public void showData(){
      System.out.println("Data B");
  }
}
public class Annotations {
    @FilledAnnotation(value = 13)
    private static final int Thing = 3;

    public static void main(String [] args){
        B b = new B();
      //  b.show();
        b.showData();
    }
@FilledAnnotation(name = "Joe",value = 12)
    public static void DoSomething(){
        System.out.println();
    }
}
