package by.epamtc.task2.service.comparator;

public class MaxComparator implements IComparator {

    @Override
    public int compare(int[] row1, int[] row2) {
        return maxInRow(row2) - maxInRow(row1);
    }

    public int maxInRow(int[] row) {
        int max = row[0];

        for (int i : row) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
