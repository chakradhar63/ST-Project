package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class LCSTest {
    @Test
    public void testlcs()
    {
        LCS l = new LCS();
        String str1 = "ABCD";
        String str2 = "ACDF";
        assertEquals(2, l.lcs(str1, str2));

        // Test case with no common subsequences
        String str3 = "tyfg";
        String str4 = "cvbnuty";
        assertEquals(2, l.lcs(str3, str4));

        // Test case with empty strings
        String str5 = "";
        String str6 = "";
        assertEquals(0, l.lcs(str5, str6));

        // Test case with one empty string
        String str7 = "ABC";
        String str8 = "";
        assertEquals(0, l.lcs(str7, str8));

        // Test case with long common subsequence
        String str9 = "ABCDEF";
        String str10 = "BCDF";
        assertEquals(3, l.lcs(str9, str10));

    }
}