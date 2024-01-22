package JavaProgram;

public class Paint {
    public static int strokesRequired(String[] picture) {
        if (picture == null || picture.length == 0) {
            return 0;
        }

        int rows = picture.length;
        int cols = picture[0].length();
        boolean[][] visited = new boolean[rows][cols];
        int strokes = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    char color = picture[i].charAt(j);
                    strokes++;
                    dfs(picture, visited, i, j, color);
                }
            }
        }

        return strokes;
    }

    private static void dfs(String[] picture, boolean[][] visited, int row, int col, char color) {
        if (row < 0 || row >= picture.length || col < 0 || col >= picture[0].length() ||
                visited[row][col] || picture[row].charAt(col) != color) {
            return;
        }

        visited[row][col] = true;

        dfs(picture, visited, row - 1, col, color);
        dfs(picture, visited, row + 1, col, color);
        dfs(picture, visited, row, col - 1, color);
        dfs(picture, visited, row, col + 1, color);
    }
    public static void main(String[] args) {
        String[] picture = {"aabba", "aabba", "aaacb"};
        int result = strokesRequired(picture);
        System.out.println("Minimum number of fills: " + result);
}

}