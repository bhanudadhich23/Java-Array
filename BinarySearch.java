import java.util.*;
public class BinarySearch{

    public static int binary(int number[],int key){
        int start = 0 ;
        int end  = number.length-1;

        while(start<=end){
            int middle = (start + end)/2;
            if(number[middle]==key){
                return middle;
            }
           
            if(number[middle]<key){
                 start = middle+1;
            }

            else{
                end = middle-1;
            }



        }


return -1;
    }
    public static void main(String args[]){

        int arr[] = {2,4,6,8,10,12,14};
       System.out.print(binary(arr,53));

    }
}