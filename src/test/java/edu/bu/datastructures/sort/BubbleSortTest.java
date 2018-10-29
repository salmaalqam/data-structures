package edu.bu.datastructures.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.sorting.BubbleSort;
import edu.bu.datastructures.sorting.InsertionSort;

public class BubbleSortTest {
	@Test
	public void testSort() {
		int[] data = { 1, 23, 4, 2, 13 };
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(data);
		assertEquals(1, data[0]);
		assertEquals(2, data[1]);
		assertEquals(4, data[2]);
		assertEquals(13, data[3]);
		assertEquals(23, data[4]);
	}
}