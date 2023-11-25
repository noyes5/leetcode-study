public class Solution {

    private Map<Integer, List<Integer>> graph = new HashMap<>();
   

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int[] prerequisite : prerequisites) {
            graph.putIfAbsent(prerequisite[0],new ArrayList<>());
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }

        boolean[] traced = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];

        for (int course : graph.keySet()) {
            if (dfs(course, traced, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int course, boolean[] traced, boolean[] visited) {
        if (traced[course]) {
            return true;
        }

        if (visited[course]) {
            return false;
        }

        traced[course] = true;
        visited[course] = true;

        if (graph.containsKey(course)) {
            for (int neighbor : graph.get(course)) {
                if (dfs(neighbor, traced, visited)) {
                    return true;
                }
            }
        }
        traced[course] = false;

        return false;
    }
}