/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_10;

/**
 *
 * @author eero
 */
public class Teht_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchList bsl = new BinarySearchList();
        int[]data = new int[]{28, 8, 25, 3, 34, 14, 39, 12, 22, 6};
        for(int key : data) {
            bsl.insert(key);
        }
        
        System.out.println(bsl.search(8));
    }
    
}
