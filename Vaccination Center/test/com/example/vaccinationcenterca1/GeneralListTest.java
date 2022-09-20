package com.example.vaccinationcenterca1;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class GeneralListTest {

    private GeneralList<VaccinationCenter> generalList = new GeneralList<>();
    private VaccinationCenter vac1, vac2, vac3, vac4;


    @Before
    public void setUp() throws Exception {
        vac1 = new VaccinationCenter("Waterford", "123456789", "1234567", "000");
        vac2 = new VaccinationCenter("Cork", "123456789", "1234567", "000");
        vac3 = new VaccinationCenter("Dublin", "123456789", "1234567", "000");
        vac4 = new VaccinationCenter("Limerick", "123456789", "1234567", "000");
    }

    @Test
    void add() {

        generalList.add(vac1);
        assertEquals(1, generalList.size());

    }

    @Test
    void size() {
        generalList.add(vac1);
        generalList.add(vac2);
        generalList.add(vac3);
        generalList.add(vac4);
        assertEquals(4, generalList.size());


    }

    @Test
    void clear() {
        generalList.add(vac1);
        generalList.add(vac2);
        generalList.add(vac3);
        assertEquals(3, generalList.size());
        generalList.clear();
        assertEquals(0, generalList.size());

    }


  @Test
   void delete() {

        generalList.add(vac1);
        generalList.add(vac2);
        generalList.add(vac3);
        generalList.delete(1);
        assertEquals(2, generalList.size());

 }
}