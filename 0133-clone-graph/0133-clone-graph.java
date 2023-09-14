class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        
        Map<Node, Node> nodePair = new HashMap<>();

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node originNode = stack.pop();

            if (!nodePair.containsKey(originNode)) {
                Node copyNode = new Node(originNode.val);
                nodePair.put(originNode, copyNode);

                for (Node n : originNode.neighbors) {
                    stack.push(n);
                }
            }
        }

        for (Map.Entry<Node, Node> entry : nodePair.entrySet()) {
            Node originNode = entry.getKey();
            Node copyNode = entry.getValue();

            for (Node n : originNode.neighbors) {
                copyNode.neighbors.add(nodePair.get(n));
            }
        }

        return nodePair.get(node);
    }
}