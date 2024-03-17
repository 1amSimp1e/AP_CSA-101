public class App {
    public static void main(String[] args) throws Exception {
        // PEN PROJECT
        Pen bob = new Pen("Red", "Kura Toga");
        // Changing the pen Color 
        bob.setPenColor("Pink");
        // Change the pen Type
        bob.setPenType("Thien Long");
        System.out.println(bob);

        // TESTING METHODS THAT MAY ENCOUNTER 
        System.out.println(App.firstTwo("Bob"));
        System.out.println(App.sum(1,3));
        System.out.println(App.replaceLetter("Hello", "e", "x"));

        int[] testArray = {7,7,7,7,7};
        System.out.println(areAll7s(testArray));

        System.out.println(allLettersMatch("Hello", 'l'));
    }
    public static String firstTwo(String str){
        return "" + str.charAt(0) + str.charAt(1);
    }

    // Sum of start and end value
    public static int sum(int start, int end){
        int result = 0;
        //  Start at 1 -> end at 3
        for(int i = start; i <= end; i++){
            result += i;
        }
        return result;
    }

    // add only multiplies
    public static int sumMultiplesTo(int start, int end, int factor){
        int result = 0;
        for(int i = start; i <= end; i++){
            if(i % factor == 0){
                result += i;
            }
        }
        return result;
    }

    // Add array elements
    public static int sumArray(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++){
            result += array[i]; // arr[i] is the current element
        }
        return result;
    }

    // Add array element enhanced
    public static int sumArrayEnhanced(int[] array){
        int result = 0;
        for(int bob : array){ // For each bob in array
            result += bob; // bob is the current element
        }
        return result;
    }

    // Count specific array elements
    public static int count5s(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                result++;
            }
        }
        return result;
    }

    // Count specific array eleements in enhanced for loops
    public static int count5sEnhanced(int[] arr){
        int result = 0;
        for(int elements : arr){
            if(elements == 5){
                result++;
            }
        }
        return result;
    }

    /*
     * Create Complex String
     */

     // Replace letter
     public static String replaceLetter(String word, String oldLetter, String newLetter){
        String result = "";
        // Word is "H e l l o"
        //          0 1 2 3 4
        // Old letter: e
        // New Letter : x
        for(int i = 0; i < word.length(); i++){
            // if current letter equals the old letter
            if(word.substring(i, i + 1).equals(oldLetter)){
                // add the new letter
                result += newLetter;
            }
            else{
                // Add the originial letter 
                result += word.substring(i,i+1);
            }
        }
        return result;
     }

     // Remove E
     public static String noE(String words){
        String result = "";
        for(int i = 0; i < words.length(); i++){
            if("eE".indexOf(result.substring(i, i + 1)) < 0){
               result += words.substring(i, i + 1);     
            }
        }
        return result;
     }
     // OR 
     public static String noEAnotherVersion(String words){
        String result = "";
        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) != 'e' && words.charAt(i) != 'E'){
                result += words.charAt(i);
            }
        }
        return result; 
     }
     // OR
     public static String noEYetAnotherVersion(String words){
        String result = "";
        for(int i = 0; i < words.length(); i++){
            if(!words.substring(i, i++).equalsIgnoreCase("e")){
                result += words.substring(i, i + 1);
            }
        }
        return result;
     }
     // REMOVE VOWELS
     public static String removeVowels(String words){
        String result = "";
        for(int i = 0; i < words.length(); i++){
            if("aeiouAEIOU".indexOf(words.substring(i, i + 1)) < 0){
                result += words.substring(i, i + 1);
            }
        }
        return result;
     }

     /*
      * Find an element
      */

      // Find 1 element
     public static boolean findElemenet(int[] array, int key){
        for(int i = 0; i < array.length;i++){
            if(array[i] == key){
                return true;
            }
        }
        return false;
     }

     // Find letter is presented
     public static boolean findStringElement(String str, char letter){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                return true;
            }
        }
        return false;
     }
     // OR 
     public static boolean findStringElementAlternative(String str, char letter){
        if(str.indexOf("" + letter) < 0){
            return false;
        }
        return true;
     }

     /*
      * CHECK ALL ELEMENTS
      This one looks for opposite of what they should all be 
      if one doesn't match the condition -> return false inside loop
      */

      public static boolean areAll7s(int nums[]){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 7){
                return false;
            }
        }
        return true;
      }

      public static boolean allLettersMatch(String str, char letter){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != letter){
                return false ;
            }
        }
        return true;
      }
     

}
