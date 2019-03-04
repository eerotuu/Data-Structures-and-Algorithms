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
        ch.insert(3);
        ch.insert(9);
        ch.insert(10);
        ch.insert(17);
        ch.insert(20);
        ch.insert(17);
        ch.insert(20);
        ch.insert(17);
        ch.insert(20);
        
        
        System.out.println(ch.find(9));
        System.out.println(ch.find(8));
        
    }
    
}
