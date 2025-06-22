import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        List<Integer> nums = new ArrayList<>();
        getInput(nums);
        sortNumbers(nums);
        displayOutput(nums);
    }

    private static void getInput(List<Integer> nums) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while (nums.size() < MAX) {
            String s = inp.nextLine();

            if (!isValidType(s)) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            int num = Integer.parseInt(s);

            if (!isValidRange(num)) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }
        inp.close();
    }

    private static boolean isValidType(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isValidRange(int num) {
        return num >= 0 && num <= 10;
    }

    private static void sortNumbers(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static void displayOutput(List<Integer> nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}