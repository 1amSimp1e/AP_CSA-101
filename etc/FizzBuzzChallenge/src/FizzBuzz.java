
import java.util.*;

public class FizzBuzz {
  public static void main(String[] args){
    System.out.println(fizzbuzz(16)); // Length of the list is 16
  }

  public static ArrayList fizzbuzz(int n) 
  {
    /*
     * Don't need to specify the length of the list since we know 
     * ArrayList is resizeable
     */
    ArrayList listElements = new ArrayList();

    /* Using for loops from 0 to the length of the elements which is n
    *  Loops would repeat 16 times 
    *  then add i + 1 (we want 1 -> length of the list) each time
    */
    for(int i = 0; i < n;i++){
      listElements.add(i + 1);
    }

    // Check Fizz and Buzz (Backwards) then add the elements to the list
    for(int i = 0; i < listElements.size(); i++){
      // If divisible by 3 then set that current element to String "Fizz"
      if((i + 1) % 3 == 0){
        listElements.set(i, "Fizz");
      }
      // If divisible by 5 then set that current element to String "Buzz"
      if((i + 1) % 5 == 0){
        listElements.set(i, "Buzz");
      }
      if(((i + 1) % 5 == 0) && ((i + 1) % 3 == 0)){
         listElements.set(i, "FizzBuzz");
      }

    } 
    // Returning the listElements 
    return listElements;
  }
}
