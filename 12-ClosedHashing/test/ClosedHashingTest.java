/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_12;

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
public class ClosedHashingTest {
    
    ClosedHashing list;
    
    public ClosedHashingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        list = new ClosedHashing(7);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testFull() {
        int[] data = new int[]{1,2,3,4,5,6,7,8};
        for(int val : data) {
            list.insert(val);
        }
        assertEquals(7, list.capacity);
    }
    
    @Test
    public void testFind() {
        int[] data = new int[]{19,8,27,13,48};
        for (int val : data) {
            list.insert(val);
        }
        
        int[] expectedIndex = new int[]{5,1,6,0,2};
        for (int i=0; i<data.length; i++) {
            assertEquals(expectedIndex[i], list.find(data[i]));
        }
        
        assertEquals(-1, list.find(4));
    }
    
    
    
}
