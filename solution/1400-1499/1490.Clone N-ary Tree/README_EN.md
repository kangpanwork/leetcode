# [1490. Clone N-ary Tree](https://leetcode.com/problems/clone-n-ary-tree)

[中文文档](/solution/1400-1499/1490.Clone%20N-ary%20Tree/README.md)

## Description

<p>Given a <code>root</code>&nbsp;of an N-ary tree,&nbsp;return a&nbsp;<a href="https://en.wikipedia.org/wiki/Object_copying#Deep_copy" target="_blank"><strong>deep copy</strong></a>&nbsp;(clone) of the tree.</p>

<p>Each node in the n-ary tree&nbsp;contains a val (<code>int</code>) and a list (<code>List[Node]</code>) of its children.</p>

<pre>
class Node {
    public int val;
    public List&lt;Node&gt; children;
}
</pre>

<p><em>Nary-Tree input serialization&nbsp;is represented in their level order traversal, each group of children is separated by the null value (See examples).</em></p>

<p><strong>Follow up:&nbsp;</strong>Can your solution work for the <a href="https://leetcode.com/problems/clone-graph/">graph problem</a>?</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<p><img src="https://cdn.jsdelivr.net/gh/doocs/leetcode@main/solution/1400-1499/1490.Clone%20N-ary%20Tree/images/narytreeexample.png" style="width: 100%; max-width: 300px;" /></p>

<pre>
<strong>Input:</strong> root = [1,null,3,2,4,null,5,6]
<strong>Output:</strong> [1,null,3,2,4,null,5,6]
</pre>

<p><strong>Example 2:</strong></p>

<p><img alt="" src="https://cdn.jsdelivr.net/gh/doocs/leetcode@main/solution/1400-1499/1490.Clone%20N-ary%20Tree/images/sample_4_964.png" style="width: 296px; height: 241px;" /></p>

<pre>
<strong>Input:</strong> root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
<strong>Output:</strong> [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The depth of the n-ary tree is less than or equal to <code>1000</code>.</li>
	<li>The total number of nodes is between <code>[0,&nbsp;10^4]</code>.</li>
</ul>

## Solutions

DFS.

<!-- tabs:start -->

### **Python3**

```python
"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children if children is not None else []
"""

class Solution:
    def cloneTree(self, root: 'Node') -> 'Node':
        if root:
            node = Node(val=root.val)
            node.children = [self.cloneTree(child) for child in root.children]
            return node
```

### **Java**

```java
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;


    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public Node cloneTree(Node root) {
        if (root == null) {
            return null;
        }
        Node node = new Node(root.val);
        for (Node child : root.children) {
            node.children.add(cloneTree(child));
        }
        return node;
    }
}
```

### **C++**

```cpp
/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    Node* cloneTree(Node* root) {
        if (root == nullptr) {
            return nullptr;
        }
        Node* node = new Node(root->val);
        vector<Node*> children;
        for (Node* node : root->children) {
            children.push_back(cloneTree(node));
        }
        node->children = children;
        return node;
    }
};
```

### **Go**

```go
/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Children []*Node
 * }
 */

func cloneTree(root *Node) *Node {
	if root == nil {
		return nil
	}
	node := &Node{Val: root.Val}
	for _, child := range root.Children {
		node.Children = append(node.Children, cloneTree(child))
	}
	return node
}
```

### **...**

```

```

<!-- tabs:end -->