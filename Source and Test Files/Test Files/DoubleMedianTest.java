package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class DoubleMedianTest {
    @Test
    public void testdoublemedian()
    {
        DoubleMedian dm = new DoubleMedian();

        //Test 1
        int a1[]={12,114,215,357,501,689,808,927,1083,1277,1386,1528,1717,1883};
        int b1[]={46,148,312,413,578,693,807,974,1087,1267,1389,1578,1736,1896,2074,2213,2338,2501,2675};
        assertEquals(1083.0, dm.median(a1, b1), 0.0001);

        int a2[]={51, 162, 302, 491, 610, 753, 916, 1031, 1183, 1288, 1456, 1573, 1714, 1872, 2047, 2222, 2417, 2601, 2784, 2903, 3079, 3202, 3366, 3474, 3616, 3739, 3866, 4039, 4164, 4264, 4407, 4587, 4707, 4870, 5005, 5121, 5267, 5412, 5556, 5737, 5842, 5976, 6129, 6295, 6470, 6606, 6726, 6845, 7024, 7183, 7309, 7466, 7608, 7747, 7901, 8084, 8242, 8346, 8520, 8670, 8848, 8949, 9143, 9257, 9393, 9510, 9643, 9765, 9897, 10026, 10216, 10390, 10563, 10721, 10916, 11100, 11293, 11443, 11551, 11656, 11820, 11924, 12029, 12206, 12343, 12456, 12620, 12800, 12913, 13082, 13272, 13458, 13569, 13672, 13780, 13914};
        int b2[]={70, 193, 335, 534, 674, 805, 967, 1115, 1277, 1444, 1586, 1781, 1898, 2083, 2235, 2381, 2572, 2707, 2858, 3024, 3183, 3366, 3534, 3668, 3833, 4028, 4143, 4299, 4408, 4508, 4614, 4740, 4880, 5064, 5252, 5416, 5542, 5719, 5896, 6054, 6207, 6343, 6474, 6579, 6771, 6881, 6993, 7150, 7330, 7527, 7629, 7814, 7941, 8047, 8191, 8341, 8502, 8640, 8791, 8952, 9148, 9283, 9418, 9518, 9716, 9840, 9964, 10123, 10301, 10416, 10531, 10698, 10861, 11059, 11248, 11446, 11618, 11734, 11871, 11971, 12088, 12218, 12354, 12460, 12641, 12750, 12888, 13017, 13202, 13395, 13551, 13680, 13859, 13978, 14132, 14307, 14469, 14652, 14782, 14921, 15082, 15224, 15332, 15474, 15624, 15733, 15904, 16043, 16236, 16389, 16568, 16716, 16897, 17031, 17171, 17295, 17449, 17562, 17710, 17881, 18069, 18236, 18345, 18526, 18677, 18851, 19016, 19158, 19277, 19403, 19537, 19715, 19861, 19962, 20114, 20302, 20426, 20580, 20692, 20800, 20966};
        assertEquals(8791.0, dm.median(a2, b2), 0.0001);

        int a3[]={1,4,8,10,10,13,13};
        int b3[]={3,4,9,9,11,13,15,16};
        assertEquals(10.0, dm.median(a3, b3), 0.0001);

        int[] a4 = {1, 3, 5};
        int[] b4 = {2, 4, 6};
        assertEquals(3.5, dm.median(a4, b4), 0.0001);

        int[] a5 = {1};
        int[] b5 = {2, 3, 4};
        assertEquals(2.5, dm.median(a5, b5), 0.0001);

        int[] a6 = {1, 2, 2};
        int[] b6 = {2, 4, 4};
        assertEquals(2.0, dm.median(a6, b6), 0.0001);

        int[] a7 = {1, 3, 5};
        int[] b7 = {2};
        assertEquals(2.5, dm.median(a7, b7), 0.0001);

    }
}