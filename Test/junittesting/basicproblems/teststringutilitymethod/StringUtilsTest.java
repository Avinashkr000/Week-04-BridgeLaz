package org.example.Day05.junittesting.basicproblems.teststringutilitymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    void reverse() {
        assertEquals("sweta" , StringUtils.reverse("atews"));
    }

    @Test
    void isPalindrome() {
        assertEquals(true , StringUtils.isPalindrome("assa"));
    }

    @Test
    void toUpperCase() {
        assertEquals("SWETA" , StringUtils.toUpperCase("sweta"));
    }
}