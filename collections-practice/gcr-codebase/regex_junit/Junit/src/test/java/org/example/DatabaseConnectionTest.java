package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        // initializing database connection before test
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        // closing database connection after test
        db.disconnect();
    }

    @Test
    void testConnectionStatus() {
        // verifying connection is active during test
        assertTrue(db.isConnected());
    }
}