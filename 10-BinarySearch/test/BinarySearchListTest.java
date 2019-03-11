/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eero
 */
public class BinarySearchListTest {
    BinarySearchList list;
    int[] data;
    
    public BinarySearchListTest() { 
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        list = new BinarySearchList();
        data = new int[]{28, 22, 25, 3, 34, 14, 39, 12, 8, 6};
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class BinarySearchList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        System.out.println("______________________________________________");
        int[] correct = new int[]{3, 6, 8, 12, 14, 22, 25, 28, 34, 39};
        
        for(int key : data) {
            list.insert(key);
        }
        
        int key = list.get(0);
        for(int i=0; i < correct.length; i++) {
            assertEquals(correct[i], list.get(i));
            System.out.println("index: " + i + " (" + correct[i] + ", " + list.get(i)+")");
            
        }
        
        System.out.println("______________________________________________");
    }

    /**
     * Test of search method, of class BinarySearchList.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        
        assertEquals(-1, list.search(3));
        
        for(int key : data) {
            list.insert(key);
        }
        assertEquals(0, list.search(3));
        assertEquals(4, list.search(14));
        assertEquals(9, list.search(39));
        assertEquals(-1, list.search(1));
        
    }
    
}
