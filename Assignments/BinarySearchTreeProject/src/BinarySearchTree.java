/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Dec 3, 2018
* Assignment: BinarySearchTree
* Description: 
*/
public class BinarySearchTree <E extends Comparable>{
    private TreeNode<E> root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }
    
    public void insertNode(E value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value, root);
        }
    }
    
    public void inOrderHelper(TreeNode<E> node){
        if(node == null){
            return;
        }
        inOrderHelper(node.getLeftChild());
        System.out.print(node.getElement() + " ");
        inOrderHelper(node.getRightChild());
    }
    
    public void inOrderTraverse(){
        inOrderHelper(root);
    }
    
    public void preOrderHelper(TreeNode<E> node){
        if(node == null){
            return;
        }
        System.out.print(node.getElement() + " ");
        preOrderHelper(node.getLeftChild());
        preOrderHelper(node.getRightChild());
    }
    
    public void preOrderTraverse(){
        preOrderHelper(root);
    }
    
    public void postOrderHelper(TreeNode<E> node){
        if(node == null){
            return;
        }
        postOrderHelper(node.getLeftChild());
        postOrderHelper(node.getRightChild());
        System.out.print(node.getElement() + " ");
    }
    
    public void postOrderTraverse(){
        postOrderHelper(root);
    }
}
