package algorithms;

import metrics.PerformanceTracker;

public class BoyerMooreMajorityVoteTest {
    public static void main(String[] args) {
        testCase(new int[]{1, 2, 1, 1, 3, 1, 1}, 1);
        testCase(new int[]{1, 2, 3, 4, 5}, -1);
        testCase(new int[]{7}, 7);
        testCase(new int[]{}, -1);
        testCase(new int[]{5, 5, 5, 5, 5}, 5);
    }

    private static void testCase(int[] input, int expected) {
        PerformanceTracker tracker = new PerformanceTracker();
        int result = BoyerMooreMajorityVote.findMajority(input, tracker);

        System.out.print("Test array: ");
        for (int x : input) System.out.print(x + " ");
        System.out.println();

        System.out.println("Expected: " + expected + ", Got: " + result);
        System.out.println((result == expected ? "Passed" : "Failed"));
        System.out.println("--------------------------");
    }
}
