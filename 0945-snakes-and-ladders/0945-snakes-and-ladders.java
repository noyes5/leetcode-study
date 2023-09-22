class Solution {
    public int snakesAndLadders(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int target = rows * cols;

        int r;
        int c;
        int p;
        boolean[] visited = new boolean[rows*cols + 1];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        q.offer(new int[] {0,1});
        visited[1] = true;

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int s = arr[0] / 1000 + 1;

            for (int i = 1; i <= 6; i++) {
                p = arr[1] + i;
                if (visited[p]) {
                    continue;
                }
                visited[p] = true;

                r = rows - 1 - (p - 1) / cols;
                c = (p - 1) % cols;
                if ((rows - 1 - r) % 2 == 1) {
                    c = cols - 1 - c;
                }

                int ladder = board[r][c];

                if (ladder > 0 && ladder <= target) {
                    p = ladder;
                }
                if (p == target) {
                    return s;
                }

                q.offer(new int[]{s * 1000 + 500 - p,p});
            }    
        }
        return -1;
    }
}