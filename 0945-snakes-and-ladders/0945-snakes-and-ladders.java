class Solution {
    int snakesAndLadders(int[][] board) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = board[0].length;
        int number = 1;
        boolean isRightDirection = true;
        for (int i = board.length - 1; i >= 0; i--) {
            if (isRightDirection) {
                for (int j = 0; j < board[0].length; j++) {
                    map.put(number, board[i][j]);
                    number++;
                }
            } else {
                for (int j = board[0].length - 1; j >= 0; j--) {
                    map.put(number, board[i][j]);
                    number++;
                }
            }
            isRightDirection = !isRightDirection;
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(1);
        int count = 0;
        visited.add(1);
        while (!queue.isEmpty()) {
            System.out.println(visited);
            int size = queue.size();
            for (int h = 0; h < size; h++) {
                int current = queue.poll();

                if (current == n * n) {
                    return count;
                }

                for (int i = 1; i < 7; i++) {
                    int nextNumber = current + i;
                    
                    if (nextNumber == n * n) {
                        queue.offer(nextNumber);

                        break;
                    }
                    if (nextNumber <= n * n) {
                        if (map.get(nextNumber) != -1) {
                            nextNumber = map.get(nextNumber);
                        }

                        if (!visited.contains(nextNumber)) {
                            visited.add(nextNumber);
                            queue.offer(nextNumber);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}