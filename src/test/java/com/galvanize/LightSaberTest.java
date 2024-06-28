package com.galvanize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LightSaberTest {


    private LightSaber lightSaber;
    private float charge;

    @BeforeEach
    public void setUp() {this.lightSaber = new LightSaber(100);
    }

    @Test
    public void testJediSerialNumber() {
        // Generate a valid long value (example: greater than 0)
        long validJediSerialNumber = generateValidJediSerialNumber();
        // Instantiate LightSaber with the generated valid serial number
        LightSaber lightSaber = new LightSaber(validJediSerialNumber);
        // Retrieve the serial number from LightSaber instance
        long jediSerialNumber = lightSaber.getJediSerialNumber();
        // Assert that the retrieved Jedi serial number is valid (greater than 0)
        assertTrue(jediSerialNumber > 0);
    }

    // Method to generate a valid Jedi serial number
    private long generateValidJediSerialNumber() {
        // generate a random long value greater than 0
        return (long) (Math.random() * Long.MAX_VALUE) + 1; // Random number between 1 and Long.MAX_VALUE
    }

    @Test
    public void testSetChargeAt80() {
        lightSaber.setCharge(80.0f);
        assertEquals(80.0f, lightSaber.getCharge());
    }

    @Test
    public void testSetColorToPurple() {
        lightSaber.setColor("purple");
        assertEquals("purple", lightSaber.getColor());
    }

    @Test
    public void testGetChargeAt70() {
        charge(70);
        assertEquals(70, lightSaber.getCharge());
    }

    private void charge(int i) {
        lightSaber.setCharge(i);
    }

    @Test
    public void testGetJediSerialNumber() {
        long jediSerialNumber = lightSaber.getJediSerialNumber();
        assertEquals(jediSerialNumber,lightSaber.getJediSerialNumber());}


}
