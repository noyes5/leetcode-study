public class Node {
    Map<Character, Node> children;
    boolean isEndOfWord;

    public Node() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }
}


class WordDictionary {
    Node root;

    public WordDictionary() {
        this.root = new Node();
    }
    
    public void addWord(String word) {
        if (word.length() == 0) {
            return;
        }
        Node currentNode = this.root;

        for (char c : word.toCharArray()) {
            Node childrenNode = currentNode.children.get(c);

            if (childrenNode == null) {
                childrenNode = new Node();
                currentNode.children.put(c, childrenNode);
            }

            currentNode = childrenNode;
        }

        currentNode.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchRecursive(this.root, word);
    }

    private boolean searchRecursive(Node node, String word) {
        if (word.length() == 0) {
            return node.isEndOfWord;
        }

        char c = word.charAt(0);

        if (c == '.') {
            for (Node childrenNode : node.children.values()) {
                if (searchRecursive(childrenNode, word.substring(1))) {
                    return true;
                }
            }
            return false;
        } else {
            Node childredNode = node.children.get(c);
            return childredNode != null && searchRecursive(childredNode, word.substring(1));
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */