/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Dec 3, 2018
* Assignment: BinarySearchTreeProject
* Description: 
*/
public class BinarySearchTreeProject {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        /*
        for(int i = 0; i < 15; i++){
            tree.insertNode(Integer.parseInt((Math.random()* 10)));
        }
        */
        
        tree.insertNode(30);
        tree.insertNode(20);
        tree.insertNode(10);
        
        System.out.print("Inorder: ");
        tree.inOrderTraverse();
        
        System.out.print("Preorder: ");
        tree.preOrderTraverse();
        
        System.out.print("Postorder: ");
        tree.postOrderTraverse();
    }

}
