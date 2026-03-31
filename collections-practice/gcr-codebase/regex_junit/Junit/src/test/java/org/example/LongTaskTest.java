package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class LongTaskTest {

    private final LongTask task = new LongTask();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testTimeout() {
        // expecting this test to fail because the task takes 3s
        assertDoesNotThrow(() -> task.run());
    }
}