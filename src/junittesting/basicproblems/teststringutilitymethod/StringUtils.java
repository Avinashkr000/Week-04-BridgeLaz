package org.example.Day05.junittesting.basicproblems.teststringutilitymethod;

public class StringUtils {
      public static String reverse(String string){
            if (string == null) return null;
            return new StringBuilder(string).reverse().toString();
      }
      public static boolean isPalindrome(String string) {
                if (string == null) return false;
                String reversed = reverse(string);
                return string.equals(reversed);
      }
      public static String toUpperCase(String string) {
                if (string == null) return null;
                return string.toUpperCase();
            }
        }


