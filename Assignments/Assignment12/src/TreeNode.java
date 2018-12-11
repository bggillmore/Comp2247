/*
* Author: Benjamin Gillmore
* Date: Dec 10, 2018
* Assignment: TreeNode
* Description: defines each node on tree
*/
public class TreeNode <E extends Comparable> {
    //data members
    private E element;
    private TreeNode leftChild, rightChild, parent;
    
    //constructor
    public TreeNode(E element) {
        this.element = element;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    //setters and getters
    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    //sets children and parents of each element when inserting new node
    public void insert(E element, TreeNode parent){
        if(element.compareTo(parent.getElement()) < 0){
            if(this.leftChild == null){
                this.leftChild = new TreeNode(element);
                this.leftChild.setParent(parent);
            }
            else{
                this.leftChild.insert(element, this.leftChild);
            }
        }
        else{
            if(this.rightChild == null){
                this.rightChild = new TreeNode(element);
                this.rightChild.setParent(parent);
            }
            else{
                this.rightChild.insert(element, this.rightChild);
            }
        }
    }
    
}
