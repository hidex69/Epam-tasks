package by.epamtc.task2.service.comparator;


public class SumComparator implements IComparator {
    @Override
    public int compare(int[] row1, int[] row2) {
        return rowSum(row2) - rowSum(row1);
    }

    public int rowSum(int[] row) {
        int result = 0;

        for (int i : row) {
            result += i;
        }

        return result;
    }
}
