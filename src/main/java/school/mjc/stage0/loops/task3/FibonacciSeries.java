package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int previous = 0;
        int next = 1;
        System.out.println(previous);
        System.out.println(next);
        for (int i = 0; i < lastFibonacci - 2; i++) {
            next = previous + 1;
            previous = next;
            System.out.println(previous);
        }
    }
}
