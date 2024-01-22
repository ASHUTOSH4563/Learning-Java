package JavaProgram;

import java.util.Arrays;
import java.util.Comparator;

public class countMeet {
    public static int countMeetings(int[] firstDay, int[] lastDay) {
        int n = firstDay.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingInt(i -> lastDay[i]));

        int count = 0;
        boolean[] visited = new boolean[366];

        for (int i = 0; i < n; i++) {
            int investorIndex = indices[i];
            for (int day = firstDay[investorIndex]; day <= lastDay[investorIndex]; day++) {
                if (!visited[day]) {
                    visited[day] = true;
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] firstDay = {1, 2, 3, 3, 3};
        int[] lastDay = {2, 2, 3, 4, 4};
        int result = countMeetings(firstDay, lastDay);
        System.out.println("Maximum number of meetings: " + result);
    }
}
