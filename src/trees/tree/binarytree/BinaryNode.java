/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees.tree.binarytree;

import java.util.ArrayList;
import trees.tree.Node;

/**
 *
 * @author Estudiantes
 */
public class BinaryNode <T extends Comparable> extends Node <T> {


    public BinaryNode(T value, Node parent) {
        super(value, parent);
        ArrayList<Node> childs = new ArrayList<>(2);
        childs.add(null);
        childs.add(null);
        this.setChilds(childs);
    }

    @Override
    public void addNode(Node<T> node) {
        if(node.getValue().compareTo(this.getValue())>0){
            if(this.getChilds().get(1)!=null){
                this.getChilds().get(1).addNode(node);
            }else{
                this.getChilds().set(1, node);
            }
        }else{
            if(this.getChilds().get(0)!=null){
                this.getChilds().get(0).addNode(node);
            }else{
                this.getChilds().set(0, node);
            }
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
