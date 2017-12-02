package com.matrix;

import org.junit.Test;

import static java.util.function.Predicate.isEqual;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void shouldAddTwoMatrices() {
        //given
        Matrix a = new Matrix(3, 3,
                new double[][]{
                        {1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0},
                        {7.0, 8.0, 9.0}
                });

        Matrix b = new Matrix(3, 3,
                new double[][]{
                        {11.0, 22.0, 33.0},
                        {44.0, 55.0, 66.0},
                        {77.0, 88.0, 99.0}
                });

        //when
        Matrix c = a.add(b);

        //then
        assertEquals(c.get(0,0), 12.0, 0.01);
        assertEquals(c.get(0,1), 24.0, 0.01);
        assertEquals(c.get(0,2), 36.0, 0.01);
        assertEquals(c.get(1,0), 48.0, 0.01);
        assertEquals(c.get(1,1), 60.0, 0.01);
        assertEquals(c.get(1,2), 72.0, 0.01);
        assertEquals(c.get(2,0), 84.0, 0.01);
        assertEquals(c.get(2,1), 96.0, 0.01);
        assertEquals(c.get(2,2), 108.0, 0.01);
    }

    @Test
    public void shouldMultiplyTwoMatrices() {
        //given
        Matrix a = new Matrix(3, 3,
                new double[][]{
                        {1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0},
                        {7.0, 8.0, 9.0}
                });

        Matrix b = new Matrix(3, 3,
                new double[][]{
                        {1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0},
                        {7.0, 8.0, 9.0}
                });

        //when
        Matrix c = a.multiply(b);

        //then
        assertEquals(c.get(0,0), 30.0, 0.01);
        assertEquals(c.get(0,1), 36.0, 0.01);
        assertEquals(c.get(0,2), 42.0, 0.01);
        assertEquals(c.get(1,0), 66.0, 0.01);
        assertEquals(c.get(1,1), 81.0, 0.01);
        assertEquals(c.get(1,2), 96.0, 0.01);
        assertEquals(c.get(2,0), 102.0, 0.01);
        assertEquals(c.get(2,1), 126.0, 0.01);
        assertEquals(c.get(2,2), 150.0, 0.01);
    }

    @Test
    public void shouldMultiplyTwoMatrices2() {
        //given
        Matrix a = new Matrix(2, 3,
                new double[][]{

                        {1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0}

                });

        Matrix b = new Matrix(3,2,
                new double[][]{
                        {1.0, 2.0},
                        {3.0, 4.0},
                        {5.0, 6.0}
                });

        //when
        Matrix c = a.multiply(b);

        //then
        assertEquals(c.get(0,0), 22.0, 0.01);
        assertEquals(c.get(0,1), 28.0, 0.01);
        assertEquals(c.get(0,2), 49.0, 0.01);
        assertEquals(c.get(1,0), 64.0, 0.01);

    }
}
