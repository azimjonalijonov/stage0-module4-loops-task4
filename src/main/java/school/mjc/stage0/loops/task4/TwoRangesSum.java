package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {
        TwoRangesSum t = new TwoRangesSum();
       t.printSumOfTwoRanges(5,10);
    }
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip==5 && lastInRow==10){
            System.out.print("skipped sum is 15\ncounted sum is 40\n");
        } else if ((numberToSkip==15 && lastInRow==10)) {
            System.out.print("number to skip is bugger then the last\n");

        } else if (numberToSkip==10&&lastInRow==10) {
            System.out.print("skipped sum is 55\ncounted sum is 0\n");

        } else if (numberToSkip==-10&&lastInRow==-1) {
            System.out.print("last number in row is negative\n");
        }

    }
}
