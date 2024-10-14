import java.util.Random;
public class BubbleSort {

	public static void main(String[] args) {
		
		//variable to measure execution time
		long start = System.nanoTime();
		
		//creating a new array for one million random ints
		Random random = new Random();
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(9);
		}
		//print the array
		for (int i : nums) {
			System.out.print(i + " ");
		}
		//Bubble sort algorithm
		for(int i = 0; i < nums.length-1; i ++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println();
		for (int i : nums) {
			System.out.print(i + " ");
		}
		//measure the execution time
		long duration = (System.nanoTime() - start)/1000000;
		System.out.println("The execution time is: " + duration + "ms");
		
		
		

	}

}
