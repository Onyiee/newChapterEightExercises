package com.exerciseEightPointFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    RectangleClass rectangleClass;

    @BeforeEach
    void setUp() {
        rectangleClass = new RectangleClass();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lengthOfRectangleCanBeGotten() throws RectangleClassExceptions {
        rectangleClass.setLengthOfRectangle(15.0);
        assertEquals(15.0, rectangleClass.getLengthOfRectangle());
    }

    @Test
    void widthOfRectangleCanBeGotten() throws RectangleClassExceptions {
        rectangleClass.setWidthOfRectangle(18.0);
        assertEquals(18.0, rectangleClass.getWidthOfRectangle());
    }

    @Test
    void areaOfRectangleCanBeGotten() throws RectangleClassExceptions {
        rectangleClass.setLengthOfRectangle(15.0);
        rectangleClass.setWidthOfRectangle(18.0);
        rectangleClass.areaOfRectangle();
        assertEquals(270.0, rectangleClass.getAreaOfRectangle());
    }

    @Test
    void perimeterOfRectangleCanBeGotten() throws RectangleClassExceptions {
        rectangleClass.setLengthOfRectangle(15.0);
        rectangleClass.setWidthOfRectangle(18.0);
        rectangleClass.perimeterOfRectangle();
        assertEquals(66.0, rectangleClass.getPerimeterOfRectangle());
    }

    @Test
    void exceptionsCanBeCaught() throws RectangleClassExceptions {
        assertThrows(RectangleClassExceptions.class, ()->rectangleClass.setLengthOfRectangle(30));
        assertThrows(RectangleClassExceptions.class, ()->rectangleClass.setWidthOfRectangle(45));
    }
}