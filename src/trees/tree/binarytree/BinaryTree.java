/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees.tree.binarytree;

import trees.tree.Node;
import trees.tree.Tree;

/**
 *
 * @author Estudiantes
 */
public class BinaryTree <T extends Comparable> extends Tree <T> {

    public BinaryTree() {
        this.setGrade(2);
        this.setHigh(0);
        this.setRoot(null);
    }

    @Override
    public void addNode(Node<T> node) {
        if(getRoot()!=null){
            getRoot().addNode(node);
        }else{
            this.setRoot(node);
        }
    }

    @Override
    public void removeNode(Node<T> node) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void drawTree() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
