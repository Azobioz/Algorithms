import java.util.Scanner;

public class Search_Insert_Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(searchInsert(array, 5));
    }

    static int searchInsert(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        int leftToTarget = 0;
        int indexToInsert = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < target){
                leftToTarget = nums[i];
                indexToInsert = i + 1;
            }
        }
        return indexToInsert;
    }
}
