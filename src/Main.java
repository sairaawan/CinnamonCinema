import java.util.Random;

public class Main {
    public static void main(String args[]) throws Exception {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(1, 15); i++) {
            Reservation reserve = new Reservation("Saira", random.nextInt(1, 5));
        }


    }
}
