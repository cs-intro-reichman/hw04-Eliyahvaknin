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

    }
    array[max_index] = Integer.MIN_VALUE;

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
}
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

