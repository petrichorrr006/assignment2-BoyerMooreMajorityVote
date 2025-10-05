package algorithms;

import metrics.PerformanceTracker;

public class BoyerMooreMajorityVote {
    public static int findMajority(int[] array, PerformanceTracker tracker) {
        if (tracker == null) tracker = new PerformanceTracker();

        if (array == null) throw new IllegalArgumentException("Array must not be null");
        if (array.length == 0) return -1;

        int candidate = 0;
        int count = 0;

        for (int value : array) {
            tracker.incrementArrayAccesses();
            if (count == 0) {
                candidate = value;
                count = 1;
                tracker.incrementUpdates();
            } else {
                tracker.incrementComparisons();
                if (candidate == value) {
                    count++;
                    tracker.incrementUpdates();
                } else {
                    count--;
                    tracker.incrementUpdates();
                }
            }
        }

        int occurrences = 0;
        for (int value : array) {
            tracker.incrementArrayAccesses();
            tracker.incrementComparisons();
            if (candidate == value) occurrences++;
        }

        return (occurrences > array.length / 2) ? candidate : -1;
    }
}
