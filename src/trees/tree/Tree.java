/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees.tree;

/**
 *
 * @author Estudiantes
 */
public abstract class Tree<T> {
    private Node<T> raiz = null;
    private int high;

    public Tree() {
        high = 0;
    }

    /**
     * @return the raiz
     */
    public Node<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Node<T> raiz) {
        this.raiz = raiz;
    }

    /**
     * @return the high
     */
    public int getHigh() {
        return high;
    }

    /**
     * @param high the high to set
     */
    public void setHigh(int high) {
        this.high = high;
    }
    
    public abstract void addNode(Node<T> node);
    public abstract void removeNode(Node<T> node);
    public abstract void drawTree();
    
    public void addNode(Node<T> parent, Node<T> child, int pos){
        parent.getChilds().set(pos, child);
    }
}
