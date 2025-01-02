# DFS

This project demonstrates the Depth-First Search (DFS) algorithm to traverse a binary tree and search for a specific target value. The DFS traversal explores each node by going as deep as possible into the tree before backtracking. During the traversal, each node visited is printed, allowing you to observe the order of node visits.

The program will print the visited nodes during the DFS traversal and indicate whether the target value was found in the tree.

Features
DFS Traversal: The program uses a Depth-First Search technique to traverse the tree in a pre-order manner (root, left, right).
Target Search: The program searches for a specific target value within the tree. If the target is found, it will stop and return true.
Visited Nodes: As the DFS algorithm traverses through the tree, it prints out the nodes that are visited, giving a clear trace of the DFS exploration.
Code Walkthrough
The core of the algorithm is implemented in the dfs(TreeNode node, int target) function, which follows these steps:

Base Case: If the current node is null, return false (end of the path).
Print Visited Node: When a node is visited, its value is printed to the console.
Target Check: If the value of the current node matches the target, return true (target found).
Recursive Search: The function calls itself recursively to search both the left and right subtrees.
Termination: The traversal terminates when the target is found or when all nodes are visited.
The main program creates a sample binary tree, specifies the target value, and calls the DFS function. It then outputs whether the target was found and the order of visited nodes.
