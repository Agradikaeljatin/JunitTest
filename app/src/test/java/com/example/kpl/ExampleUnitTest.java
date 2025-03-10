package com.example.kpl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleUnitTest {

    /*
       Test case 1:
       Memeriksa apakah fungsi add() dapat menjumlahkan angka dengan benar.
       Input: (2, 3)
       Expected Output: 5
    */
    @Test
    public void addition_isCorrect() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    /*
       Test case 2:
       Memeriksa apakah fungsi multiply() dapat mengalikan angka dengan benar.
       Input: (4, 3)
       Expected Output: 12
    */
    @Test
    public void multiplication_isCorrect() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(4, 3));
    }
}