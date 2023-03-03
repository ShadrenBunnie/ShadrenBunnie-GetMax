public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int max = arr[0]; // initialize max

        for(int i = 0; i < arr.length; i++){ //start to loop through the array
            if( max < arr[i]){ // compare variable max to the array element
                //if the element is greater than the previous max variable, then replace with new element to max variable
            max = arr[i];                
            }
        }
        return max; //print out the official number after cycling through the array
    }
}
