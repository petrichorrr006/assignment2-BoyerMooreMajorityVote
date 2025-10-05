package cli;

import algorithms.BoyerMooreMajorityVote;
import metrics.PerformanceTracker;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input array size: ");
        int n = sc.nextInt();

        int[] input = new int[n];
        System.out.println("Input " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        PerformanceTracker tracker = new PerformanceTracker();
        int majority = BoyerMooreMajorityVote.findMajority(input, tracker);

        System.out.print("Array: ");
        for (int x : input) System.out.print(x + " ");
        System.out.println();

        System.out.println("Array size: " + input.length);
        if (majority != -1) {
            System.out.println("Majority element: " + majority);
        } else {
            System.out.println("No majority element found");
        }

        tracker.printStats();
    }
}
