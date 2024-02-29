// Standard Algorithms that use arrays
// Marie Muya
import java.util.Arrays;   
public class standardAlgorithms {
//collaboration w Meena
    //method to compute sum of all integers in array
   public static String computeSum(int[] arrayofInts)
    {
        int sum = 0; //initialize sum
        int i;
        //Iterate through all elements and add them
        for (i = 0; i < arrayofInts.length; i++){
            sum += arrayofInts[i];
            
        }
        return "The sum of your integer array is " + sum;
    }
    
    //method to determine max value
    public static String getMax(int [] numArray){
        int maximum = numArray[0];
        for (int l = 0; l < numArray.length; l ++){
            if (numArray[l] > maximum){
                maximum = numArray[l];
            }
        }
        return "The maximum integer of your array is " + maximum;
    }
    
    //method to get min value
    public static String getMin(int [] numArray){
        int minimum = numArray[0];
        for (int l = 0; l < numArray.length; l ++){
            if (numArray[l] < minimum){
                minimum = numArray[l];
            }
        }
        return "The minimum integer of your array is " +  minimum;
    }    
    
    
    //method to get average of all ints in array
         public static String computeAvg(int[] numArray){
         int sum = 0; //initialize sum
        int i;
        int avg;
        int length;
        length = numArray.length;
        //Iterate through all elements and add them
        for (i = 0; i < numArray.length; i++){
            sum += numArray[i];
            
        }
        avg = 0;

        avg = sum/length;
        return "The average of your integer array is " + avg;
        }
        
    
    //method to get the mode
  public static String computeMode(int [] numArray){
      int tally;
      int mode; 
    tally = 1;
    mode = 0;
 Arrays.sort(numArray); //sort method
 for( int a = 0; a < numArray.length-1; a++){
     if (numArray[a] == numArray[a+1]){
         tally = tally + 1; 
        if (tally >= 2){
            mode = numArray[a];
     }
 }
 }
  
 return "The mode is: " + mode;
}

//method to determine if one or more element of an int array has a property (is even)
  public static String haveEvens(int [] numArray){
      boolean x; 
      x = false;
      for (int a = 0; a < numArray.length; a++){
          if ((numArray[a]%2) == 0){
              x = true;
          }
      }
      return "One element of the array is even: " + x;
  }


//method to determine if one or more element of a string array has a particular property (a string that they specify)
 public static String haveString(String [] stringArray, String string){
     boolean x;
     x = false; 
      for (int a = 0; a < stringArray.length; a++){
          if (stringArray[a] == string){
              x = true;
          }
      }
      return "One element of the string array has the inputed string" + ": " + x;
  }

   //method to determine if all elements of the array has a particular property (even)
  public static String allEven(int [] intArray){
      boolean x; 
      x = false;
       Arrays.sort(intArray);//sort array
       if ((intArray[0]%2) == 0){
              x = true;
          }
      return "All elements of the integer array are even" + x;
  }

   //method to determine if all elements of a String array has a particular property (equals a String)
  public static String allSameString(String [] stringArray, String string){
      boolean x; 
      x = false;
      for (int a = 0; a < stringArray.length; a++){
          if (stringArray[a] == string){
              x = true;
          }
         else{
             x = false;
         }
      }
      return "All elements of the array are " + string + ": " + x;
  }

//counts the number of consecutive pairs 
public static String consecutive(int [] numArray){
    int count;
    count = 0;
    for (int a = 0; a == numArray.length-2; a++){
        
        if ((numArray[a+1] - numArray[a]) == 1){
            count++;
            
        }
    }
    return "You have:" + count + " consecutive pairs in your array. ";
}

        
        //method to determine the if there are duplicate elements in a String array
       
           public static String duplicates(String [] stringArray){
            boolean x; 
         x = false;
           for (int a = 0; a < stringArray.length; a++) 
        {
            for (int b = 0; b < stringArray.length; b++) 
            {
    
                    if (stringArray[a] == stringArray[b]) 
                    {
                        x = true; 
                    }
            }
        }
              return "The string array contains duplicates: " + x;
        }
        
        //method to determine how many elements are even 
         public static String howManyEvens(int [] numArray){
      int count;
      count = 0;
      for (int a = 0; a < numArray.length; a++){
          if ((numArray[a]%2) == 0){
              count = count + 1;
          
         }
      }
      return "There are " + count + " even integers in your array. ";
  }
        
        
        
        //method to shift elements to the right in an int array
        public static String rightInt(int [] numArray){
            String returnsArray;
            returnsArray = " ";
            int length;
            length = numArray.length;

            int last;
            last = numArray[length-1];
            
        int[] duplicate = numArray.clone(); //used this site: https://www.baeldung.com/java-array-copy
            duplicate[0] = last;
           for( int j = 0; j == length-2 ; j++ ){
            duplicate[j+1] = numArray [j];
        }
            for (int a = 0; a < duplicate.length; a++){
          returnsArray = returnsArray + String.valueOf(duplicate[a]+ " ");
      }
 
        return "The array shifted to the right is " + returnsArray;
        }
        //method shifts elements to the right in a String array
        public static String rightString(String [] stringArray){
            String returnsArray;
            returnsArray = "";
            int len;
            len = stringArray.length;
            String last;
            last = stringArray[len-1];
        String[] duplicate = stringArray.clone(); // https://www.baeldung.com/java-array-copy
        duplicate[0] = last;
           for( int j = 0; j < len-1 ; j++ ){
            duplicate[j+1] = stringArray [j];
        }

            for (int a = 0; a < duplicate.length; a++){
          returnsArray = returnsArray + String.valueOf(duplicate[a]+ " ");
      }
            
        return "The array shifted to the right is " + returnsArray;
        }
        
        
        //method to shift elements to the left
          public static String leftString(String [] stringArray){
            String returnsArray;
            int length;
            String second;
            String first;
            returnsArray = "";
            length = stringArray.length;
            first = stringArray[0];
            second = stringArray[1];
        String [] duplicate = stringArray.clone(); //method found from this site: https://www.baeldung.com/java-array-copy
            duplicate[length-1]= first;
           for( int a = 0; a< length-1 ; a++ ){
            duplicate[a] = stringArray [a+1];
        }
            for (int b = 0; b < duplicate.length; b++){
          returnsArray = returnsArray + String.valueOf(duplicate[b]+ " ");
      }
        return "The array shifted to the left is " + returnsArray;
        }
        
    
    //reverse order of elements in array:
    public static String reverseOrderInts( int[] array){
        int a;
        int b;
        int length;
        a = array.length-1;
        length = array.length;
        String returnsArray;
        returnsArray = "";
         for (a = array.length-1; a >=0; a--){
          returnsArray = returnsArray + String.valueOf(array[a]+ " ");
      }
     return "The reverse order is: " + returnsArray;
    }
    
 
    
   public static void main(String args[]) {
    //creating various arrays
    int [] intArray = {8,9,4,10,24,21}; //int number array
    String [] animalArray = {"bunny", "wolf", "zebra", "cow", "pig", "mouse", "lion"}; //string array
    String [] colorPairsArray = {"red", "purple", "pink", "blue" , "purple", "red", "blue", "pink"}; //string with pairs array
    String [] sameAnimalArray = {"bunny", "bunny", "bunny"}; //array with the same repeated string
    Boolean[] booleanArray = new Boolean[9]; //boolean array
    
    //max number from array
    System.out.println(getMax(intArray));
    //get min number from array
    System.out.println(getMin(intArray));
    //get sum of numbers in array
    System.out.println(computeSum(intArray));
    //get average of numbers in array
    System.out.println(computeAvg(intArray));
    //get mode of numbers in array
    System.out.println(computeMode(intArray));
    //determine if one or more element of an int array is even
    System.out.println(haveEvens(intArray));
    //determine if one or more element of a string array has a string they input
    System.out.println(haveString(animalArray, "cow"));  //true test case      
    System.out.println(haveString(animalArray, "shark"));  //false test case      
    //determine if all elements of an int array are even
    System.out.println(allEven(intArray)); 
    //determine if all elements of a String array have the same string
    System.out.println(allSameString(sameAnimalArray, "bunny")); //true test case
    System.out.println(allSameString(animalArray, "zebra")); //false test case
    //count the num of consecutives in array
    System.out.println(consecutive(intArray));
    //determine the absence or presence of duplicates in String array
    System.out.println(duplicates(colorPairsArray)); //true case
    //determine how many elements are even
    System.out.println(howManyEvens(intArray));
    //shift elements to the right in an int array
    System.out.println(rightInt(intArray));
    //shift elements to the right in a String array
    System.out.println(rightString(animalArray));
    //shift elements to the left in a String array
    System.out.println(leftString(animalArray));
    //reverse the order of elements in a string array:
    System.out.println(reverseOrderInts(intArray));
    
}
}
