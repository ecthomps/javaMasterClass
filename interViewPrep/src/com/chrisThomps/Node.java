package com.chrisThomps;

public class Node {

    int key;
    Node left;
    Node right;
    Node root;

    private Node insert2BST(Node root, int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if(data < root.key)
            root.left = insert2BST(root.left, data);
        else
            root.right = insert2BST(root.right, data);

        return root;
    }

    Node(int data){
        key = data;
        left = right = null;
    }

    Node(){
        root = null;
    }

    void insert(int data){
        root = insert2BST(root, data);
    }

    void inorder(){
        inorder(root);
    }

    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    boolean isBST(){
//        if(root != null){
//            if(root.left != null && root.left.key > root.key)
//                return false;
//            if(root.right != null && root.right.key < root.key)
//                return false;
//            if(!(isBST(left)) && !isBST(right))
//                return false;
//        }
//        return true;

        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node root, int minVal, int maxVal){
        if(root == null)
            return true;
        else if(minVal > root.key || maxVal > root.key)
            return false;
        return checkBST(root.left, minVal, root.key) && checkBST(root.right, root.key, maxVal);
    }
}

//    Node tree = new Node();
//        tree.root = new Node(4);
//                tree.root.left = new Node(2);
//                tree.root.right = new Node(5);
//                tree.root.left.left = new Node(1);
//                tree.root.left.right = new Node(3);
//
//        /*
//        *               4
//        *           2       5
//        *       1          3
//        * */
//
//                if (tree.isBST())
//                System.out.println("IS BST");
//                else
//                System.out.println("Not a BST");
