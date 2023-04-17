package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        StringBuilder strBuilder = new StringBuilder("1");
        int counter = 0;
        int result = 0;
        if (lengthOfLastNumber < 0) {
            System.out.println(result);
        } else {
            while (counter < lengthOfLastNumber) {
                result = result + 9 * Integer.parseInt(strBuilder.toString());
                counter++;
                strBuilder.append("1");
            }
            System.out.println(result);
        }
    }
}
