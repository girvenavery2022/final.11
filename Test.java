
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLargest {

	private Largest temp1;
	@Test
	public void test() {
		testPositive();
		testNegative(); 
	}
	public void testPositive(){
		int[] arr = new int[4];
		arr[0] = 11;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		for(int i = 0; i < arr.length-1;i++)
			assert arr[i]>0;
		Largest temp1 = new Largest();
		int maxValue = temp1.largest(arr);
		System.out.println(maxValue);
	}
	public void testNegative() {
		int[] arr = new int[4];
		arr[0] = -3;
		arr[1] = -8;
		arr[2] = -1;
		arr[3] = -20;
		for(int i = 0;i<arr.length-1;i++)
			assert arr[i] < 0;
		Largest temp1 = new Largest();
		int minValue = temp1.largest(arr);
		System.out.println(minValue);
	}
