import java.util.Random;
public class MergeSort {
	
	public static void main(String [] args) {
		long start = System.nanoTime();
		
		Random random = new Random();
		
		int [] nums = new int[10];
		
		int inputLength = nums.length;
		
		for(int i = 0; i < inputLength; i++) {
			nums[i] = random.nextInt(9);
			
			System.out.print(nums[i] + " ");
		}
		
		private static void merge(int[] nums) {
			int inputLength = nums.length;
			if( inputLength  < 2) {
				return;
			}
			int midIndex = (inputLength / 2);
			int[] leftNode = new int[midIndex];
			int[] rightNode = new int[inputLength - midIndex];
			
			for(int i = 0; i < midIndex; i ++) {
				leftNode[i] = nums[i];
		}
			for(int i = midIndex; i < inputLength; i ++) {
				rightNode[i - midIndex] = nums[i];
			}
			
			
		
		
		
		
		
	}

}
