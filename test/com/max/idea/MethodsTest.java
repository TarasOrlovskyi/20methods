package com.max.idea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    Methods methods = new Methods();

    @Test
    void testIntToChar() {
        assertArrayEquals(new char[]{'2', '3', '4', '5'}, methods.intToChar(new int[]{50, 51, 52, 53}));
    }

    @Test
    void testGetMaxFromTwoValues() {
        assertEquals(20, methods.getMax(20, 10));
    }

    @Test
    void testGetMaxFromThreeValues() {
        assertEquals(20, methods.getMax(10, 6, 20));
    }

    @Test
    void testGetMaxFromFiveValues() {
        assertEquals(7, methods.getMax(2, 4, 1, 7, 3));
    }

    @Test
    void testCharToSting() {
        assertEquals("task", methods.charToSting(new char[]{'t', 'a', 's', 'k'}));
    }

    @Test
    void testIntComparisonUp() {
        assertEquals(2, methods.intComparisonUp(new int[]{1, 2, 5, 2, 7, 49}, 5));
    }

    @Test
    void testIntComparisonDown() {
        assertEquals(1, methods.intComparisonDown(new int[]{1, 2, 5, 10, 7, 49}, 2));
    }

    @Test
    void testFactorial() {
        assertEquals(720, methods.factorial(6));
    }

    @Test
    void testCalendarLeapYear() {
        assertTrue(methods.calendarLeapYear(2000));
    }

    @Test
    void testIntMultipleArrayElement() {
        assertArrayEquals(new int[]{10, 20, 0, 70, 105, 50}, methods.intMultipleArrayElement(new int[]{10, 11, 32, 20, 0, 97, 70, 105, 50}, 5));
    }

    @Test
    void testIntArraySortUp() {
        assertArrayEquals(new int[]{1, 4, 7, 12}, methods.intArraySortUp(new int[]{4, 12, 7, 1}));
    }

    @Test
    void testCheckForByteRepeat() {
        assertTrue(methods.checkForByteRepeat(new byte[]{1, 5, 2, 7, 40, 5, 3}));
    }

    @Test
    void testMultiplyIntArray() {
        assertArrayEquals(new int[]{4, 9, 12, 25, 20, 2}, methods.multiplyIntArray(new int[]{1, 3, 3, 5, 5, 1}, new int[]{4, 3, 4, 5, 4, 2}));
    }

    @Test
    void testGetDifferentElementsOfArrays() {
        assertArrayEquals(new int[]{8, 6, 7, 0}, methods.getDifferentElementsOfArrays(new int[]{1, 1, 8, 4, 5}, new int[]{6, 0, 7, 4, 5}));
    }

    @Test
    void testIntReversArray() {
        assertArrayEquals(new int[]{10, 3, 5, 9, 12}, methods.intReversArray(new int[]{12, 9, 5, 3, 10}));
    }

    @Test
    void testIntArrayRandom() {
        int minLevel = 2;
        int maxLevel = 10;
        int count = 0;
        int[] result = methods.intArrayRandom(4, minLevel, maxLevel);
        for (int i = 0; i < result.length; i++) {
            if (result[i] < minLevel | result[i] > maxLevel) {
                count++;
            }
        }
        assertEquals(0, count);
    }

    @Test
    void testCharCheckArray() {
        assertTrue(methods.charCheckArray(new char[]{'M', 'A', 'X', 'O', 'L', 'Y', 'A'}, new char[]{'M', 'A', 'X', 'O'}));
    }
}