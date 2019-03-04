/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_11;

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
public class BinaryHeapTest {
    BinaryHeap heap;
    int[] data;
    
    
    public BinaryHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        heap = new BinaryHeap(16);
        data = new int[]{32, 54, 15, 7, 65, 20, 4, 38, 27, 44};
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class BinaryHeap.
     */
    @Test
    public void testInsert() { 
        for (int i = 0; i < data.length; i++) {
            heap.insert(data[i]);
        }
        assertEquals(data.length, heap.size());
        int[] expected = new int[]{4, 15, 7, 27, 44, 32, 20, 54, 38, 65 };
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], heap.get(i));
        }
    }

    /**
     * Test of deleteMin method, of class BinaryHeap.
     */
    @Test
    public void testDeleteMin() {
        heap.deleteMin();
        heap.insert(5);
        heap.insert(10);
        assertEquals(2, heap.size());
        heap.deleteMin();
        assertEquals(10, heap.get(0));
        heap.deleteMin();
        assertEquals(0, heap.size());
        for (int i = 0; i < data.length; i++) {
            heap.insert(data[i]);
        }
        heap.deleteMin();
        int[] expected = new int[]{7, 15, 20, 27, 44, 32, 65, 54, 38};
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], heap.get(i));
        }
        
        heap.deleteMin();
        expected = new int[]{15, 27, 20, 38, 44, 32, 65, 54};
        
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], heap.get(i));
        }
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBounds() {
        heap.get(0);
    }
    
    
    
}
