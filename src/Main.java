import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	 Car auto = new Car (5);
	 auto.sayState();
	 auto.sayKm();
	 auto.gaz();
	 auto.gaz();
	 auto.step();
	 auto.sayKm();
	 auto.sayAv();
	 auto.sayState();
	 auto.gaz();
	 auto.step();

         }


}
