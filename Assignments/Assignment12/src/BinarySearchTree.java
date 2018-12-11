/*
* Author: Benjamin Gillmore
* Date: Dec 10, 2018
* Assignment: BinarySearchTree
* Description: defines binary tree of treenodes
*/
public class BinarySearchTree <E extends Comparable>{
    //data members
    private TreeNode<E> root;
    
    //constructor
    public BinarySearchTree(){
        root = null;
    }

    //setter and getter
    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }
    
    
    //inserts node into tree
    public void insertNode(E element){
        if(root == null){
            root = new TreeNode(element);
        }
        else{
            root.insert(element, root);
        }
        
    }
    
    //inserts root as 1st node to pass into inOrderHelper
    public void inOrderTraverse(){
        inOrderHelper(root);
    }
    //prints tree "inOrder"
    private void inOrderHelper(TreeNode node){
        if(node.getElement() == null){
            return;
        }
        if(node.getLeftChild() != null){
            inOrderHelper(node.getLeftChild());
        }
        System.out.print(node.getElement().toString() + "\n");
        if(node.getRightChild() != null){
            inOrderHelper(node.getRightChild());
        }
        
    }
    
    //inserts root as 1st node to pass into preOrderHelper
    public void preOrderTraverse(){
        preOrderHelper(root);
    }
    //prints tree "preOrder"
    private void preOrderHelper(TreeNode node){
        if(node.getElement() == null){
            return;
        }
        System.out.print(node.getElement().toString() + "\n");
        if(node.getLeftChild() != null){
            preOrderHelper(node.getLeftChild());
        }
        if(node.getRightChild() != null){
            preOrderHelper(node.getRightChild());
        }
    }
    
    //inserts root as 1st node to pass into postOrderHelper
    public void postOrderTraverse(){
        postOrderHelper(root);
    }
    //prints tree "postOrder"
    private void postOrderHelper(TreeNode node){
        if(node.getElement() == null){
            return;
        }
        if(node.getLeftChild() != null){
            postOrderHelper(node.getLeftChild());
        }
        if(node.getRightChild() != null){
            postOrderHelper(node.getRightChild());
        }
        System.out.print(node.getElement().toString() + "\n");
    }
    
    //inserts root as 1st node to pass into searchHelper
    public TreeNode search(E key){
        return searchHelper(root, key);
    }
    //searches tree for comaprable element
    public TreeNode searchHelper(TreeNode node, E key){
        if(node.getElement().compareTo(key) == 0){
            return node;
        }
        else if(node.getLeftChild() != null && node.getElement().compareTo(key) < 0){
            searchHelper(node.getLeftChild(), key);
        }
        else if(node.getRightChild() != null && node.getElement().compareTo(key) > 0){
            searchHelper(node.getRightChild(), key);
        }
        return null;
    }
}
