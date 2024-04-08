import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numArray = new int[arrayLength];
        int numbers = -1;
        for (int i = 0; i < numArray.length; i++){
            numbers = scanner.nextInt();
            numArray[i] = numbers;
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(numArray, target)));

    }

    static int[] twoSum(int[] nums, int target){
        int[] sumOfTarget = new int[2];
        for(int i = 0, j = 0; i < nums.length - 1;){
            if (nums[j] + nums[i+1] == target && j != i+1){
                sumOfTarget[0] = j;
                sumOfTarget[1] = i+1;
                break;
            }
            i++;
            if (i == nums.length - 1){
                j++;
                i = 0;
            }

        }
        return sumOfTarget;
    }
}
