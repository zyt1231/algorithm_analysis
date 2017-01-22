/**
 * Created by Ting on 1/21/17.
 */
public class IslandPerimeter {
    public static int solution(int[][] grid) {
        int perimeter = 0;
        int x = grid[0].length;
        int y = grid.length;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && grid[i - 1][j] == 1) perimeter -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) perimeter -= 2;
                }
            }
        }
        return perimeter;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,1,0,0},{1,1,1,0},{0,1,1,1},{0,0,0,0}}));
    }
}
