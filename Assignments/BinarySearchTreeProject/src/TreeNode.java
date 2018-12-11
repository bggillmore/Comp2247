/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Dec 3, 2018
* Assignment: TreeNode
* Description: 
*/
public class TreeNode <E extends Comparable>{
    private E element;
    private TreeNode<E> rightChild, leftChild, parent;

    public TreeNode(E element) {
        this.element = element;
        //this.rightChild = rightChild;
        //this.leftChild = leftChild;
        //this.parent = parent;
    }

    
    
    public TreeNode<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
    
    
    
    
    public void insert(E value, TreeNode<E> node){
        if(value.compareTo( node.getElement()) < 0){
            //go to left subtree
            if(leftChild == null){
                //insert here
                leftChild = new TreeNode(value);
                leftChild.setParent(node);
                node.setLeftChild(leftChild);
            }
            else{
                //call insert recursevly on leftchild
                leftChild.insert(value, node.getLeftChild());
            }
        }
        else{
            if(rightChild == null){
                //insert here
                rightChild = new TreeNode(value);
                rightChild.setParent(node);
                node.setRightChild(rightChild);
            }
            else{
                //call insert recursevly on leftchild
                rightChild.insert(value, node.getRightChild());
            }
        }
        
    }
}
