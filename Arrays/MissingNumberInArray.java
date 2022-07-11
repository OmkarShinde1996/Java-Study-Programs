class MissingNumberInArray {
    int MissingNumber(int array[], int n) {
        // get the sum of natural numbers
        int No_ele = n;
        int total_sum = No_ele *(No_ele + 1)/2;

        //get the sum of elements present in array
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum = sum + array[i];
        }
        //return natural number sum - sum
        return (total_sum - sum);
    }
  
  public static void main(String[] args){
    int arr[]={1,2,3,5};
    System.out.println(MissingNumber(arr,5));
  }
}
