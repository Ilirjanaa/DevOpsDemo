package ch.zhaw.iwi.devops.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String convert(int number) {
        if (number < 1 || number > 3999) {
            return "Ungültige Nummer";
        }

        Map<Integer, String> roman_numerals = new LinkedHashMap<>();
        roman_numerals.put(1000, "M");
        roman_numerals.put(900, "CM");
        roman_numerals.put(500, "D");
        roman_numerals.put(400, "CD");
        roman_numerals.put(100, "C");
        roman_numerals.put(90, "XC");
        roman_numerals.put(50, "L");
        roman_numerals.put(40, "XL");
        roman_numerals.put(10, "X");
        roman_numerals.put(9, "IX");
        roman_numerals.put(5, "V");
        roman_numerals.put(4, "IV");
        roman_numerals.put(1, "I");

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : roman_numerals.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (number >= value) {
                result.append(symbol);
                number -= value;
            }
        }
        return result.toString();
    }
}