/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eero
 */
public class BinarySearchList {

    private List<Integer> list;

    public BinarySearchList() {
        list = new ArrayList();
    }

    public void insert(int key) {
        int index = 0;
        
        if(list.isEmpty()) {
            list.add(key);
        } else {
            index = getIndex(key, 1, list.size());
            list.add(index, key);
        }
        System.out.println("added: " + key + ", index:" + index);

    }

    private int getIndex(int key, int min, int max) {
        System.out.println("new loop(" + min + ", " + max + ")");
        
        int middle = (min + max) / 2;

        if (middle == 0) {
            return key < list.get(middle) ? 0 : 1;
        }

        if (middle == list.size()) {
            return key < list.get(middle - 1) ? middle -1 : middle;
        }
        
        if (max < min) {
            return middle + 1;
        }
        
        return key < list.get(middle) 
                ? getIndex(key, min, middle -1)
                : getIndex(key, middle +1, max);
                
    }
    
    public int search(int key) {
        if(list.isEmpty()) {
            return -1;
        }
        return searchIndex(key, 1, list.size());
    }
    
    private int searchIndex(int key, int min, int max) {
        int middle = (min + max) / 2;
        
        if(key == list.get(middle)) {
            return middle;
        }
        
        if(max < min) {
            return -1;
        }

        return key < list.get(middle) 
                ? searchIndex(key, min, middle -1)
                : searchIndex(key, middle + 1, max);

    }
    
    public int get(int index) {
        return list.get(index);
    }
    
    
}
