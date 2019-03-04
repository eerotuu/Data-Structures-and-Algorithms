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
        int[] data = new int[] {
            32, 54, 15, 7, 65, 20, 4, 38, 27, 44
        };
        for(int value : data) {
            heap.insert(value);
        }
        
        System.out.println("\nprinting full list:");
        for(int i = 0 ; i<heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }
    }
    
}
