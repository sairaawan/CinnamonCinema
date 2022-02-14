import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    Reservation reserve;

    @BeforeEach
    void setUp() throws Exception {
         reserve=new Reservation("Saira",2);
    }

    @Test
    void checkSeatsAvailable()  {

            boolean thrown = false;
            try {
                reserve.reserveSeat(16);
            } catch (Exception e) {
                thrown = true;
            }
            assertTrue(thrown);
        }

    @Test
    void checkReserveSeatReturnsNewList() {
        List<String> newList=reserve.getTotalSeats();
        int newSize=newList.size();
        assertEquals(newSize, 11);
    }
    @Test
    void checkReserveSeatAssignSeat() {
        String allocatedSeat=reserve.reserveSeat(2);
        assertEquals(allocatedSeat, "A4");
    }
}