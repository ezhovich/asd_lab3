import java.util.Random;

public class App {
    public static void main(String[] args) {
        RBTree bst = new RBTree();
        long tStart = System.nanoTime();
        for(int i = 0; i < 10001; i++){
            bst.insert((int)(Math.random()*100));
        }
        long tEnd = System.nanoTime();
        System.out.println("Insertion time for RBTree is " + (tEnd-tStart) + " nanoseconds");

        long tStartDel = System.nanoTime();
        bst.deleteNode(40);
        long tEndDel = System.nanoTime();
        System.out.println("Delete time for RBTree is " + (tEndDel-tStartDel) + " nanoseconds");



       AVLTree<Integer, Integer> avl = new AVLTree<>();

        long tStartA = System.nanoTime();
        for(int i = 0; i < 10001; i++){
            avl.add((int)(Math.random()*100), (int)(Math.random()*100));
        }
        long tEndA = System.nanoTime();
        System.out.println("Insertion time for AVLTree is " + (tEndA-tStartA) + " nanoseconds");

        long tStartDelA = System.nanoTime();
        avl.delete(40);
        long tEndDelA = System.nanoTime();
        System.out.println("Delete time for AVLTree is " + (tEndDelA-tStartDelA) + " nanoseconds");


    }
}
