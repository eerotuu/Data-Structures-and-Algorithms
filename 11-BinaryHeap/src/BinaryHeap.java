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
public class BinaryHeap {

    private int[] heap;
    private int heapSize;
    private int capacity;

    public BinaryHeap(int max) {
        heap = new int[max];
        capacity = max;
        heapSize = 0;
    }

    public void insert(int key) {
        if (heapSize == capacity) {
            System.out.println("full");
            return;
        }

        int i = heapSize;
        heap[i] = key;

        int parent = (i - 1) / 2;

        while (i != 0 && heap[parent] > heap[i]) {
            swap(parent, i);
            i = parent;
            parent = (i - 1) / 2;
        }

        heapSize++;
    }

    public void deleteMin() {
        if (heapSize == 0) {
            System.out.println("empty");
            return;
        }
   
        if (heapSize == 2) {
            heap[0] = heap[1];
            heapSize--;
            return;
        }

        heap[0] = heap[heapSize - 1];
        heapSize--;
        
        reOrderHeap(0);
    }

    private void reOrderHeap(int index) {
        int i = index;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int lowest = i;

        if (left < heapSize && heap[left] < heap[right]) {
            lowest = left;
        }
        if (left < heapSize && heap[left] > heap[right]) {
            lowest = right;
        }

        if (heap[lowest] < heap[i]) {
            swap(lowest, i);
            reOrderHeap(lowest);

        }
    }

    private void swap(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
    
    public int get(int index) {
        if (index < heapSize) {
            return heap[index];
        }
        throw new IndexOutOfBoundsException();
    }
    
    public int size() {
        return heapSize;
    }

}
