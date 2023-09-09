public class Node {
    public Map<Character, Node> children;
    public boolean isEndOfWord;

    public Node() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }
}

class Trie {
    private Node root;

    public Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        Node currentNode = this.root;

        for (char c : word.toCharArray()) { 
            if (!currentNode.children.containsKey(c)) {
                currentNode.children.put(c, new Node());
            }
            currentNode = currentNode.children.get(c);
        }
        currentNode.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchNode(this.root, word) != null;
    }

    public Node searchNode(Node node, String word) {
        if (word.length() == 0) {
            if (node.isEndOfWord) {
                return node;
            } else {
                return null;
            }
        }

        char c = word.charAt(0);
        Node childredNode = node.children.get(c);

        if (childredNode == null) {
            return null;
        }

        return searchNode(childredNode, word.substring(1));
    }
    
    public boolean startsWith(String prefix) {
        Node currentNode = this.root;
        
        for (char c : prefix.toCharArray()) {  
            Node child = currentNode.children.get(c);
            if (child == null) {
                return false;
            }
            currentNode = child;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */