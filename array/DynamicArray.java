package array;
import java.util.*;
public class DynamicArray{
    private static final int initialCapacity=16;
    private int array[];
    private int size;
    private int capacity;

    public DynamicArray(){
        size=0;
        array = new int[initialCapacity];
        capacity = initialCapacity;
    }
    
    public void add(int value){
        if (size==capacity) { 
            expandArray();
            array[size++] = value;
        }else
        {
            array[size++] = value;
        }
        
        
    }

    private void expandArray(){
        capacity*=2;
        array = java.util.Arrays.copyOf(array, capacity);
    }


    public void display(){
        System.out.println("\nElement in the list :");
        for(int iterator = 0; iterator<size; iterator++){
            System.out.print(array[iterator]+" ");
        }
        
    }

    public void deleteAtEnd(){
        if(size==0){
            System.out.println("List is empty!");
        }
        else{
            System.out.println(array[size--] +"element was removed");

        }
    }

    public void deleteFromBeginning()
    {
        if(size==0){
            System.out.println("List is empty!");
        }
        else{
            for(int iterator = 0; iterator<size-1; iterator++){
                array[iterator] = array[iterator+1];
            }
            size--;
        }
        
    }

    public void deleteAtPosition(int position){
        if (size!=0) {
         if(position<=size-1){
             for(int iterator = 0; iterator<size-1; iterator++){
                 array[iterator] = array[iterator+1];
             }
             size--;
         }else{
             System.out.println("Invalid position!");
         }
        }else{
         System.out.println("List is empty!");
        }
 
     }

    public void insertAtBeginning(int value)
    {
        if(size==capacity){
            expandArray();
        }
        else{
            for(int iterator = size-1; iterator>=0; iterator--){
            if(iterator==0){
                array[iterator+1] = array[iterator];
                array[iterator]=value;
            }else{
                array[iterator+1] = array[iterator];
            }
            }
            size++;
        }

    }

    public void insertAtPosition(int position,int value){
       if(position<=size-1)
       {
        if(size==capacity){
            expandArray();
            for(int iterator = size-1; iterator>=position; iterator--){
                if(iterator == position)
                {
                    array[iterator+1] = array[iterator];
                    array[position]=value;
                }
                else
                    array[iterator+1] = array[iterator];

            }
            size++;
        }else
        {
            for(int iterator = size-1; iterator>=position; iterator--){
                if(iterator == position)
                {
                    array[iterator+1] = array[iterator];
                    array[position]=value;
                }
                else
                    array[iterator+1] = array[iterator];

            }
            size++;

        }
       }else
       {
           System.out.println("Invalid position!");
       }
    }

    public void SearchElement(int target){
        for(int iterator=0;iterator<size;iterator++){
            if(array[iterator]==target){
                System.out.println("The element"+target+"in index of"+iterator);
            }
        }
    }

   public int getElement(int position){

    return array[position];
    
   }

   public boolean isContain(int value){
    boolean isContain=false;
    for(int iterator=0;iterator<size;iterator++){
        if(array[iterator]==value){
            isContain= true;
        }else{
            isContain= false;

        }

    }
        return isContain;

   }


}