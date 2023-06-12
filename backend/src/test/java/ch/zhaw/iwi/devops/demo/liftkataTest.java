package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class liftkataTest {
    
    @Test
    public void testLiftCalls() {
        Lift lift = new Lift();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            lift.callLift(-1, "up");
        });
    }
}
