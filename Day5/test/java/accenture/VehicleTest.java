package accenture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    @DisplayName("Increase speed")
    void speedUp() {
        assertEquals(50, Vehicle.speedUp(10, 40));
    }

    @Test
    @DisplayName("Decrease speed")
    void speedDown() {
        assertEquals(20, Vehicle.speedDown(70, 90));
    }

    @Test
    @DisplayName("Stop vehicle")
    void stop() {
        assertEquals(0, Vehicle.stop());
    }
}