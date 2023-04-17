/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees.tree;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Node <T> {
    
    private T value;
    private ArrayList<Node> childs = new ArrayList<>();
    private int level;
    private Node parent = null;

    

    public Node(T value, int grade, Node parent) {
        this.value = value;
        this.childs = new ArrayList<>(grade);
        this.parent = parent;
    }

    public Node(T value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return the childs
     */
    public ArrayList<Node> getChilds() {
        return childs;
    }

    /**
     * @param childs the childs to set
     */
    public void setChilds(ArrayList<Node> childs) {
        this.childs = childs;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the parent
     */
    public Node getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }
    
}
