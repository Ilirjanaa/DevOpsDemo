package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest{

    @Test
    public void testConvertToRoman() {

        assertEquals("I", RomanNumerals.convert(1));
        assertEquals("II", RomanNumerals.convert(2));
        
    }
}  

    