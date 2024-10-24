import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        int array[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        for(int i=0;i<array.length;i++){
            if(array[i] == key){
                System.out.print("the element"+ key + "is at index of :"+i);
            }
        }
    }
}