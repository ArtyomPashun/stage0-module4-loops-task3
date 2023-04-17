package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        if (firstBoarder == secondBoarder) {
            result = firstBoarder;
            System.out.println(result);
        } else {
            for (int i = firstBoarder; i <= secondBoarder; i++) {
                result = result + i;
            }
            System.out.println(result);
        }
    }
}
