public class ArrayOps {
    public static void main(String[] args) {
  
    }
    
    public static int findMissingInt (int [] array) {
        for(int number=0; number<=array.length; number++) {
            boolean isFound = false;
            for(int i=0; i<array.length; i++) {
                if(array[i] == number) {
                    isFound = true;
                }
            }
            if(!isFound) {
                return number;
            }
        // TODO: remove this empty lines
        
    
    }

    return -1;
}

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int max_index=-1;
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                max_index = i;
            }
    // TODO: broken indentations from here!!
    }
    // TODO: this cause side effect to the function, you not only find max value,
    // but change the values of the array. Bad practices! Dangerous for bugs.
    array[max_index] = Integer.MIN_VALUE; 

    // TODO: actually here you find max again. So create helper function findMax. Don't repeat your code.
     int  max2 = array[0];
    for(int i=1; i<array.length; i++) {
        if(array[i] > max2) {
            max2 = array[i];
        }


}

return max2;

    }

    public static boolean checkElements(int [] a, int [] b) {
        for (int i=0; i<a.length; i++) {
            boolean isFound = false;
            for (int j=0; j<b.length; j++) {
                if(a[i] == b[j]) {
                    isFound = true;
                
                }
            }

                if(!isFound) {
                    return false;
                }
    }

    return true;       
    }



    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        if (checkElements(array1, array2) &&  checkElements(array2, array1)) {

                return true;
} // TODO: broken indentations
else {
    return false;
}

    }

    public static boolean isSorted(int [] array) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                increasing = false;
                break;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                decreasing = false;
                break;
            }
        }

        return increasing || decreasing;
    }
}

