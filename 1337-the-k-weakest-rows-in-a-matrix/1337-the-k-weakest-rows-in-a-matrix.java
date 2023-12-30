class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int i = 0; i < mat.length; i++) {
            int count = countSoldiers(mat[i]);
            pq.add(new int[] {count, i});
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
             answer[i] = pq.poll()[1];
        }

        return answer;
    }

    // binary search 사용
    private int countSoldiers(int[] row) {
        int left = 0;
        int right = row.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}