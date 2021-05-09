package com.exerciseEightPointOneFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateClassTest {
    DateClass dateClass;

    @BeforeEach
    void setUp() {
        dateClass = new DateClass();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dateClassCanSetAndGotten(){
        dateClass.setDay(3);
        assertEquals(3, dateClass.getDay());
        dateClass.setMonth(4);
        assertEquals(4, dateClass.getMonth());
        dateClass.setYear(2021);
        assertEquals(2021, dateClass.getYear());
        dateClass.setMonthInWords("may");
        assertEquals("may", dateClass.getMonthInWords());
        dateClass.setTotalDays(300);
        assertEquals(300, dateClass.getTotalDays());
    }

    @Test
    void dateClassForMonthDayYearCanBeGotten() throws DateClassExceptions {
        dateClass = new DateClass(12,22,2021);
        assertEquals(12,dateClass.getMonth());
        assertEquals(22,dateClass.getDay());
        assertEquals(2021, dateClass.getYear());
        dateClass = new DateClass("June",3, 2019);
        assertEquals("June", dateClass.getMonthInWords());
        assertEquals(3, dateClass.getDay());
        assertEquals(2019, dateClass.getYear());
        dateClass = new DateClass(365,2020);
        assertEquals(365,dateClass.getTotalDays());
        assertEquals(2020, dateClass.getYear());


    }


}