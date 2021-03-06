package edu.bu.datastructures.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.sorting.BubbleSort;
import edu.bu.datastructures.sorting.InsertionSort;
import edu.bu.datastructures.sorting.MergeSort;

public class MergeSortTest {
	@Test
	public void testSort() {
		int[] data = { 6, 44, 5, 8, 2, 7 };
		MergeSort bubbleSort = new MergeSort();
		bubbleSort.sort(data);
		assertEquals(1, data[0]);
		assertEquals(2, data[1]);
		assertEquals(4, data[2]);
		assertEquals(13, data[3]);
		assertEquals(23, data[4]);
	}
}
