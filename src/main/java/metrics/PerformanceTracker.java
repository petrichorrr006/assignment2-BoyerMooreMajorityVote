package metrics;

public class PerformanceTracker {
    private long comparisons;
    private long arrayAccesses;
    private long updates;

    public void incrementComparisons() { comparisons++; }
    public void incrementArrayAccesses() { arrayAccesses++; }
    public void incrementUpdates() { updates++; }

    public void printStats() {
        System.out.println("\n----METRICS----");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Updates: " + updates);
        System.out.println("Array accesses: " + arrayAccesses);
    }
}
