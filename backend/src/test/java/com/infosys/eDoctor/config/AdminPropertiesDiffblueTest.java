package com.infosys.eDoctor.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdminPropertiesDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AdminProperties#setPassword(String)}
     *   <li>{@link AdminProperties#setUsername(String)}
     *   <li>{@link AdminProperties#getPassword()}
     *   <li>{@link AdminProperties#getUsername()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    void testGettersAndSetters() {
        // Arrange
        AdminProperties adminProperties = new AdminProperties();

        // Act
        adminProperties.setPassword("iloveyou");
        adminProperties.setUsername("janedoe");
        String actualPassword = adminProperties.getPassword();

        // Assert that nothing has changed
        assertEquals("iloveyou", actualPassword);
        assertEquals("janedoe", adminProperties.getUsername());
    }
}
