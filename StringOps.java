
public class StringOps {

    public static void main(String[] args) {

       
    }

    public static String capVowelsLowRest (String string) {
        String ans ="";
        for (int i = 0; i < string.length(); i++) {
             char currentChar = string.charAt(i);
             boolean flip =true;
             if  (currentChar==' ' || "AEIOU".indexOf(currentChar)!=-1 ) { 
                ans+=currentChar;
            }
             else if (currentChar==' ' && currentChar+1< 'a' ||  currentChar+1< 'a'){   
                ans+=(char) (currentChar + 32);
                flip =false;
            } else if ("aeiou".indexOf(currentChar) != -1) {  
                ans += (char) (currentChar - 32);            
                flip =false;
            }else if (currentChar==' ') {
                ans+=currentChar;
                flip =false;
            } else if (flip ){
            ans+=currentChar;
        }
    }
    return ans;
}

    public static String camelCase (String string) {
            String ans = "";
            int i = 0;
       
            while (i < string.length()) {
                int firstSpace = string.indexOf(' ', i);
                String helper;
                if (firstSpace == -1) {
                    helper = string.substring(i);
                } else {
                    helper = string.substring(i, firstSpace);
                }
                for (int j = 0; j < helper.length(); j++) {
                    boolean yep =true;
                if (yep) {
                    helper=Makescapitalletters(helper);
                    ans+=helper;
                    break;
                }
                    }
           
                i += helper.length() + 1;
            }
       
            return ans =dontMake(ans);
        }

    public static int[] allIndexOf (String string, char chr) {
        int index=0;
        int charappears =counterChar(string,chr);
        int [] allIndexOfString=new int[charappears];
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==chr){
                allIndexOfString[index]=i;
                index++;
            }
        }
        return allIndexOfString;
        }



    public static String Makescapitalletters(String string){
            String ans = "";
            boolean flip = true;
       
            for (int j = 0; j < string.length(); j++) {
                flip = true;
                char currentChar = string.charAt(j);
       
                if (currentChar >= 'A' && currentChar <= 'Z' && j!=0 ) {
                    ans+=((char) (currentChar + 32));
                    flip = false;
                } else if (currentChar >= 'a' && currentChar <= 'z') {
                    if (j == 0) {
                        ans+=((char) (currentChar - 32));
                        flip = false;
                    } else {
                        ans+=(currentChar);
                    }
                } else if (flip) {
                    ans+=(currentChar);
                }
            }
       
            return ans;
       
}


static public int counterChar(String ans,char letters){
    int counter=0;
    for (int i = 0; i < ans.length(); i++) {
        if(letters==ans.charAt(i)){
            counter++;
        }
    }
    return counter;
}

public static String dontMake(String string){
    String ans="";
    for (int i = 0; i < string.length(); i++) {
    if (string.charAt(0)>= 'A' && string.charAt(0) <= 'Z' && i==0){
        ans+=(char) (string.charAt(i)+32);
    }
    else
    ans+=string.charAt(i);

}
return ans;
}
}

