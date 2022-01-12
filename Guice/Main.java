import com.google.inject.Guice;
import com.google. inject.Injector;
public class Main {
    public static void main(String [] args){
      Injector guice = Guice.createInjector(new DiscountGuiceModule());
      CheckoutService checkcout = guice.getInstance(CheckoutService.class);

      checkcout.checkout(100.00);

    }
}

