package Arrays;

public class RotateArrayByX {

    //Normal way : In this way we are shifting elements to the left 1 by 1 till x rounds
    //    public static void rotateArray(int arr[],int x){
//        for(int i = 0; i<x; i++){
//            int first=arr[0];
//            for(int j=0;j< arr.length-1;j++){
//                arr[j]=arr[j+1];
//            }
//            arr[arr.length-1]=first;
//        }
//
//    }

    //More better way as this way time required for execution is less
    //In this way we are first storing elements till x in another array then shifting OG array by x elements in
    //1 round then adding new array elements to the end of OG array
    public static void rotateArray(int arr[],int x){
        int s = 0;
        int temp[]=new int[x];//New array of size x created
        for(int i =0; i<x;i++){//Storing x elements of array arr to the new array temp
            temp[i]=arr[i];
        }
        for(int j = 0;j<arr.length-x;j++){//shifting elements of arr to left by x
            arr[j]=arr[j+x];
        }
        for(int k=arr.length-x;k<arr.length;k++){//adding temp array elements to arr ata the end
            arr[k]=temp[s];
            s++;
        }

    }
    //3
    //1 2 3 4 5 6 7
    //3 4 5 6 7 1 2


    public static void reverse(int arr[],int start, int end){
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;;
        }
    }
    public static void rotateArray1(int arr[],int num){
        int length=arr.length;
        num=num%length;
        reverse(arr,0,num-1);
        reverse(arr,num,length-1);
        reverse(arr,0,length-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotateArray1(arr,3);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
