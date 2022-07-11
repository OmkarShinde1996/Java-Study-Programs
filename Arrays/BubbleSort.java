package Arrays;
//in bubble sort we perform sorting operations till n-1 rounds and in each round largest element gets placed at last
//position. so we need to perform 2 for loops 1 to complete rounds and another one to complete steps in each
//round. and if left element in array is greater than right element then we swap them.


public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int j = 0; j<arr.length; j++){ // to complete rounds n-1
            for(int i =0; i<arr.length-j-1; i++){//to complete steps in each round and i<arr.length-j-1 because we
                // don't need to compare last sorted positions again
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,5,7,3,8,0,6,9};
        bubbleSort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//{4,1,2,5,7,3,8,0,6,9} N=10, rounds = n-1 = 9
//
//        1st
//        1 4 2 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 7 3 8 0 6 9
//        1 2 4 5 3 7 8 0 6 9
//        1 2 4 5 3 7 8 0 6 9
//        1 2 4 5 3 7 0 8 6 9
//        1 2 4 5 3 7 0 6 8 9
//
//        2nd
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 5 3 7 0 6 8 9
//        1 2 4 3 5 7 0 6 8 9
//        1 2 4 3 5 7 0 6 8 9
//        1 2 4 3 5 0 7 6 8 9
//        1 2 4 3 5 0 6 7 8 9
//
//        3rd
//        1 2 4 3 5 0 6 7 8 9
//        1 2 3 4 5 0 6 7 8 9
//        1 2 3 4 0 5 6 7 8 9
//
//        4th
//        1 2 3 4 0 5 6 7 8 9
//        1 2 3 0 4 5 6 7 8 9
//
//        5th
//        1 2 3 0 4 5 6 7 8 9
//        1 2 0 3 4 5 6 7 8 9
//
//        6th
//        1 2 0 3 4 5 6 7 8 9
//        1 0 2 3 4 5 6 7 8 9
//
//        7th
//        1 0 2 3 4 5 6 7 8 9
//        0 1 2 3 4 5 6 7 8 9