import java.util.ArrayList;

public class WorkWithArray {
    public static final int NUMBER = rund(0, 100);
    private ArrayList<Integer> Array = new ArrayList();
    private int value;

    public int getValue() {
        return value;
    }

    public boolean isOurNumber() {
        boolean res = false;
        if (value == NUMBER) {
            res = true;
        }
        return res;
    }

    public void setValue(int value) {
        this.value = value;
        Array.add(value);
    }


    public int getMaxBarrier() {
        int maxValue = 100;
        for (int i : Array) {
            if (i < maxValue && i > NUMBER) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int rund(int a, int b) {
        return a + (int) (Math.random() * b);
    }


    public int getMinBarrier() {
        int minValue = 0;
        for (int i : Array) {
            if (i > minValue && i < NUMBER) {
                minValue = i;
            }
        }
        return minValue;
    }

    public String printArray() {
        return Array.toString();
    }
}