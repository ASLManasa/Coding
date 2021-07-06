package assignment3;

public class running_sum {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}

