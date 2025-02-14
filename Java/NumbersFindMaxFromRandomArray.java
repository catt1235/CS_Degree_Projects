package Java;
import java.util.*;
public class NumbersFindMaxFromRandomArray {
    private int[] nums;

    public int findMax() {
        // if nums is empty then return 0
        if (nums.length == 0) {
            return 0;
        }

        // otherwise assuming that the first number is the maximum
        int max = nums[0];

        // running a for loop that starts from the index 1 and goes up to the last index
        for (int i = 1; i < nums.length; i++) {
            // if element at current index is greater than current max then update max
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // once the for loop ends, returning the maximum number found
        return max;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    // Fill array nums with pseudo-random integers (0-999) with a seed value
    public void fillRandomly(int seed, int size) {
        Random rand = new Random(seed);
        nums = new int[size];
        for(int i=0; i<nums.length; i++) {
            nums[i] = rand.nextInt(1000);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Numbers numObject = new Numbers();
        numObject.setNums(new int[] {2, 4, 6, 8, 10, 7, 5, 3});
        System.out.println(Arrays.toString()); // Prints content of array
        System.out.println(numObject.findMax()); // findMax() should return 10

        numObject.fillRandomly(7, 10); // Fill nums with 10 pseudo-random nmubers using seed value 7
        System.out.println(Arrays.toString()); // Prints content of array: [236, 164, 485, 44, 380, 254, 968, 649, 850, 534]
        System.out.println(numObject.findMax()); // findMax() should return 968
    }

    @Override
    public String toString() {
        return "NumbersFindMaxFromRandomArray [nums=" + Arrays.toString(nums) + ", toString()=" + getClass().getName() + "@" + Integer.toHexString(hashCode())
                + "]";
    }
}
