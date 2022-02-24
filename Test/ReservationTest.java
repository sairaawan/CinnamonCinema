import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void checkSeatsAvailable() throws Exception {
            boolean thrown = false;
            try {
                Reservation reserve=new Reservation("Saira",17);
                reserve.reserveSeat();
            } catch (Exception e) {
                thrown = true;
            }
            assertTrue(thrown);
        }

    @Test
    void checkReserveSeatReturnsNewListAndAllocatesCorrectSeat() throws Exception {
        Reservation reserve=new Reservation("Saira",3);
        List<String> newList=reserve.getTotalSeats();
        int newSize=newList.size();
        String allocatedSeat=reserve.reserveSeat();
        assertEquals(newSize, 9);
        assertEquals(allocatedSeat, "B4");
    }

}