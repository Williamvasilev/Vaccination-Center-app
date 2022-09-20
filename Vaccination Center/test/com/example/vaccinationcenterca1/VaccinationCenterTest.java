package com.example.vaccinationcenterca1;

import static org.junit.Assert.*;

import com.example.vaccinationcenterca1.VaccinationCenter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;



public class VaccinationCenterTest {
    private VaccinationCenter vac1, vac2, vac3, vac4;


    @Before
    public void setUp() throws Exception {
        vac1 = new VaccinationCenter("Waterford", "123456789", "1234567", "000");
        vac2 = new VaccinationCenter("Cork", "123456789", "1234567", "000");
        vac3 = new VaccinationCenter("Dublin", "123456789", "1234567", "000");
        vac4 = new VaccinationCenter("Limerick", "123456789", "1234567", "000");


    }
    @Test
    public void testVaccinationCenterConstructor() {
        assertEquals("Waterford", vac1.getName());
        assertEquals("123456789", vac1.getAddress());
        assertEquals("1234567", vac1.getEircode());
        assertEquals("000", vac1.getParkingSpaces());
        assertEquals("Cork", vac2.getName());
        assertEquals("123456789", vac2.getAddress());
        assertEquals("1234567", vac2.getEircode());
        assertEquals("000", vac2.getParkingSpaces());

    }
}
