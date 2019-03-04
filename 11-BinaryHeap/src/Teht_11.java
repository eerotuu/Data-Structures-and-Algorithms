/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_11;

/**
 *
 * @author eero
 */
public class Teht_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinaryHeap heap = new BinaryHeap(8);
        
        heap.insert(6);
        heap.insert(9);
        heap.insert(3);
        
        for(int i = 0 ; i<heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }
    }
    
}
