package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil >= toBreakWith) {
            if (toBreakWith >= 0) {
                for (int i = 1; i <= toBreakWith; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = -1; i >= toBreakWith; i--) {
                    System.out.println(i);

                }
            }
        } else {
            System.out.println("iterating till the end");
            if (numberToGoUntil >= 0) {
                for (int i = 1; i <= numberToGoUntil; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = -1; i >= numberToGoUntil; i--) {
                    System.out.println(i);
                }
            }
        }
    }}
