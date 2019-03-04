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
public class ClosedHashing {
    
    private Node[] list;
    private int listSize;
    public int capacity;
    
    public ClosedHashing(int size) {
        list = new Node[size];
        listSize = size;
        capacity = 0;
    }
    
    public void insert(int key) {
        if(capacity == listSize) {
            System.out.println("list full");
            return;
        }
        
        
        int i = key % listSize;
        if(list[i] == null) {
            list[i] = new Node(key);
            capacity++;
        } else {
            while(list[i] != null) {
                i++;
                if(i == listSize) {
                    i = 0;
                }
            }
            list[i] = new Node(key);
            capacity++;
        }
        System.out.println("added " + key + ", Index: " + i);
        
    }
    
    public int find(int key) {
        int i = key % listSize;
        
        int rounds = 1;
        while(list[i] != null) {
            
            if(rounds == listSize) {
                break;
            }
            
            if(list[i].key == key) {
                return i;
            }
            
            i++;
            if (i == listSize) {
                i = 0;
            }
            
            rounds++;
            
        }
        return -1;
    }
}
