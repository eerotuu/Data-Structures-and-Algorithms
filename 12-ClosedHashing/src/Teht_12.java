/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_12;

/**
 *
 * @author eero
 */
public class Teht_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClosedHashing ch = new ClosedHashing(7);
        int[] data = new int[] {
            6, 14, 5, 20, 18, 17, 2, 23
        };
        
        for(int value : data) {
            ch.insert(value);
        }
        
        
        System.out.println("find index of value 20: " + ch.find(20));
        System.out.println("find index of value 8: " + ch.find(8));
        
    }
    
}
