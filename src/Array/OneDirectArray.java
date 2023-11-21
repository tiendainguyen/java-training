package Array;

public class OneDirectArray {
    public static void main(String[] args) {
        // Exercise 1: Declare an array of integers and initialize it with values.
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10};

        // Exercise 2: Display the contents of the array.
        displayArray(numbers);

        // Exercise 3: Calculate and display the sum of all elements in the array.
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);

        // Exercise 4: Find and display the maximum element in the array.
        int max = findMax(numbers);
        System.out.println("Maximum element in the array: " + max);

        // Exercise 5: Reverse the array and display the reversed array.
        int[] reversedArray = reverseArray(numbers);
        System.out.println("Reversed array:");
        displayArray(reversedArray);

        //Exercise 6: Continue
        //Exercise 7: Break
    }

    private static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }
        return reversedArray;
    }

    private void printOddNumber(int[] arr) {
        int length = arr.length;
        for(int i = 0; i<length; i++) {
            if(i%2 == 0) {
                continue;
            }
            System.out.println("odd number is: " + i);
        }
    }

    private void printSmallerThan5(int [] arr) {
        int length = arr.length;
        for(int i = 0; i<length; i++) {
            if(arr[i] <= 5) {
                break;
            }
            System.out.println("the number is bigger than 5: " + arr[i]);
        }
    }

}
