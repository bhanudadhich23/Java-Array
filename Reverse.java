import java.util.*;
public class Reverse{
    public static void reverse(int arr[]){

       int start = 0;
       int end = arr.length-1;
       while(end>start){

             int temp  = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;

       }
       
    }
    public static void main(String args[]){
           int arr[] = {2,4,6,8,10,11};
           reverse(arr);


           for(int i=0;i<arr.length;i++){

                    System.out.print(arr[i]+" ");

           }

           
         
    }
}