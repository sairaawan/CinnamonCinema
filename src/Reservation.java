
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reservation {
    private String name;
    private final static List<String> totalSeats = new ArrayList<>(Arrays.asList(
            "A1", "A2", "A3", "A4", "A5",
            "B1", "B2", "B3", "B4", "B5",
            "C1", "C2", "C3", "C4", "C5"));
    private final int maxSeatsAllowed=3;
    private final int minSeatsAllowed=1;
    private int seatsRequested;

    public Reservation(String name) throws Exception {
        this.name = name;
        checkSeatsAvailable();
    }

    public void checkSeatsAvailable() throws Exception {
        if (seatsRequested > totalSeats.size()) {
            System.out.println("Not enough seats available for " + this.name);
            throw new Exception("Seats fully booked");
        }
    }

    public void checkSeatLimit(int seatsRequested) throws Exception {
        if (seatsRequested >= minSeatsAllowed && seatsRequested <= maxSeatsAllowed) {
            reserveSeat(seatsRequested);
        } else
            throw new Exception("You can reserve only 1-3 seats");
    }

    public String reserveSeat(int seatsRequested) {
        System.out.println("Total size " + getTotalSeats().size());
        String allocated = null;
        for (int i = 0; i < seatsRequested; i++) {
           allocated=totalSeats.get(i);
            int ticketNo = i + 1;
            System.out.println(this.name + " " + ticketNo + " seat number is " + allocated);
        }

        return allocated;
    }

    public List<String> getTotalSeats() {
        totalSeats.subList(0, seatsRequested).clear();
        System.out.println("total seats left" + totalSeats);
        return totalSeats;
    }


}
