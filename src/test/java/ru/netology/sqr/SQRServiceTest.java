package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcWhenMultipleSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(200, 300);
        int expected = 3;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testCalcWhenOneSquareFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(200, 250);
        int expected = 1;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testCalcWhenSquaresOfAllNumbersAreFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(100, 9_900);
        int expected = 90;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void testCalcWhenThereAreNoSquares() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(0, 99);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCalcLessThanRangeOfNumbers() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(10, 50);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCalcGreaterThanRangeOfNumbers() {
        SQRService service = new SQRService();

        int actual = service.calcSqrs(10_000, 11_000);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}