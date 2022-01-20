package medium;

public class ArraysOfProducts {
    public int[] arrayOfProducts(int[] array) {
        //Write a function that takes in a non-empty array of integers
        // and returns an array of the same length,
        // where each element in the output array is equal to the product of every other number in the input array.
        int len = array.length;
        int product = 1;
        int[] results = new int[len];

        for(int i = 0; i < len; i++){
            int left = i;
            int right = i;
            while (left > 0){
                product = product * array[left-1];
                left--;
                System.out.println("left:" + product);
            }

            while (right < len-1){
                product = product * array[right+1];
                right++;
                System.out.println("right:" + product);
            }

            results[i] = product;
            System.out.println("results[" + i + "]:" + product);
            System.out.println("------------------------------");
            product = 1;
        }
        return results;
    }
}
