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
    private Node<T> root = null;
    private int high;
    private int grade;

    public Tree() {
        high = 0;
    }

    /**
     * @return the root
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Node<T> root) {
        this.root = root;
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
        if(pos < 0 || pos >= grade){
            return;
        }
        if(parent == null){
            if(this.getRoot()!=null){
                this.setRoot(child);
            }else{
                // indicarle a la raiz que lo agregue en otra ubicación.
            }
        }else{
            parent.getChilds().set(pos, child);
        }
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
