package org.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AsteroidProblemTest {
    @Test
    public void testAsteroidCollision() {
        AsteroidProblem test  = new AsteroidProblem();

        // Test 1
        int[] asteroids1 = {5, 10, -5};
        int[] ans1 = {5, 10};
        assertArrayEquals(ans1, test.asteroidCollision(asteroids1));

        // Test 2
        int[] asteroids2 = {8, -8};
        int[] ans2 = {};
        assertArrayEquals(ans2, test.asteroidCollision(asteroids2));

        // Test 3
        int[] asteroids3 = {10, 2, -5};
        int[] ans3 = {10};
        assertArrayEquals(ans3, test.asteroidCollision(asteroids3));

        // Test 4
        int[] asteroids4 = {-2, -1, 1, 2};
        int[] ans4 = {-2, -1, 1, 2};
        assertArrayEquals(ans4, test.asteroidCollision(asteroids4));

        // Test 5
        int[] asteroids5 = {1, -1, -2, -2};
        int[] ans5 = {-2, -2};
        assertArrayEquals(ans5, test.asteroidCollision(asteroids5));

//        // Test 6
//        int[] asteroids6 = {5, -5, 5, -5, 5};
//        int[] expected6 = {5};
//        assertArrayEquals(expected6, new MonotonicStacks4().asteroidCollision(asteroids6));
//
//        // Test 7
//        int[] asteroids7 = {1, -2, -2, -2};
//        int[] expected7 = {-2, -2, -2};
//        assertArrayEquals(expected7, new MonotonicStacks4().asteroidCollision(asteroids7));
//
//        // Test 8
//        int[] asteroids8 = {};
//        int[] expected8 = {};
//        assertArrayEquals(expected8, new MonotonicStacks4().asteroidCollision(asteroids8));
//
//        // Test 9
//        int[] asteroids9 = {1, 2, 3, 4};
//        int[] expected9 = {1, 2, 3, 4};
//        assertArrayEquals(expected9, new MonotonicStacks4().asteroidCollision(asteroids9));
    }
}
