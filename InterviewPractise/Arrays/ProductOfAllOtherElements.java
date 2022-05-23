
// Question: Given an array of integers, return a new array such that each element at index i of the new array
// is the product of all the numbers in the original array except the one at i.

//Solution: Time Complexity of 2n ≈ O(n)
public class ProductOfAllOtherElements {
    public static void main(String[] args) {

        int my_array[] = {1,2,3,4,5};
        int array_sum = 0;
        int result_array[] = new int[5];
        // Find Array sum.
        for(int i =0;i<my_array.length;i++) {
            if(i == 0){
                array_sum = my_array[0];
            }
            else {
                array_sum = array_sum * my_array[i];
            }
            }
        // Add to result array
        for(int i=0;i<my_array.length;i++){
             result_array[i] = array_sum/my_array[i];
        }
        // Output result array.
        for (int i=0;i<my_array.length;i++){
            System.out.println("Product of all elements excluding " + i + ": " + result_array[i]);
        }
        }
    }

