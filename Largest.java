import java.util.*;
public class Largest{
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("maximum number of array is:"+max);
    }
}