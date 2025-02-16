package org.example.Day05.junittesting.advancedproblems.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDateConversion() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"), "Conversion of 2023-12-25 should return 25-12-2023");
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"), "Conversion of 2000-01-01 should return 01-01-2000");
    }

    @Test
    void testInvalidDateFormat() {
        assertEquals("Invalid date format", DateFormatter.formatDate("25-12-2023"), "Invalid format should return error message");
        assertEquals("Invalid date format", DateFormatter.formatDate("20231225"), "Invalid format should return error message");
    }

    @Test
    void testEmptyAndNullInput() {
        assertEquals("Invalid date format", DateFormatter.formatDate(""), "Empty string should return error message");
        assertEquals("Invalid date format", DateFormatter.formatDate(null), "Null input should return error message");
    }

    @Test
    void testInvalidDateValues() {
        assertEquals("Invalid date format", DateFormatter.formatDate("2023-02-30"), "Invalid date should return error message");
        assertEquals("Invalid date format", DateFormatter.formatDate("2023-13-01"), "Invalid month should return error message");
    }
}
