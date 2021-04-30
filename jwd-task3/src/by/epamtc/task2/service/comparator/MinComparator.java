package by.epamtc.task2.service.comparator;

public class MinComparator implements IComparator {
    @Override
    public int compare(int[] row1, int[] row2) {
        return minInRow(row2) - minInRow(row1);
    }

    public int minInRow(int[] row) {
        int min = row[0];

        for (int i : row) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}
