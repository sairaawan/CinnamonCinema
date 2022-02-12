import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    Reservation reserve;

    @BeforeEach
    void setUp() throws Exception {
        reserve=new Reservation("Saira",2);
    }

    @Test
    void checkSeatsAvailable() {

    }

    @Test
    void checkSeatLimit() {
    }

    @Test
    void checkReserveSeat() {
    }
}