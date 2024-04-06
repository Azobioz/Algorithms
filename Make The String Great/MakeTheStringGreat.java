package org.example;

import java.util.Objects;
import java.util.Scanner;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(makeGood(s));
    }

    static String makeGood(String s){
        String[] sArray = s.split(""); //String array with s variable letters
        for (int i = 0; i < sArray.length - 1;){

            if (isUpperAndLowerCaseEqual(sArray[i], sArray[i+1])){ //If one letter is upper case other is lower case and letters are same or vice versa
                String[] oldSArray = sArray; //New array with the same element as sArray
                sArray = new String[sArray.length - 2]; //sArray with shorter length

                for (int j = 0, f = 0; j < sArray.length || f < sArray.length - 1; f++){ //Put same elements in sArray without two not needed elements
                    if (Objects.equals(oldSArray[i], oldSArray[f])
                            && Objects.equals(oldSArray[f], oldSArray[i])
                            && Objects.equals(oldSArray[i+1], oldSArray[f+1])
                            && Objects.equals(oldSArray[f+1], oldSArray[i+1])){
                        oldSArray[i] = "#";
                        oldSArray[i+1] = "#";
                        f++;
                        continue;
                    }
                    else{
                        sArray[j] = oldSArray[f];
                        j++;
                    }
                }

            }

            int l = 0;
            if (sArray.length > 1 && isUpperAndLowerCaseEqual(sArray[l], sArray[l + 1])) { //If sArray still have not needed elements
                i = 0;
            }
            else if (sArray.length > 1 && !isUpperAndLowerCaseEqual(sArray[l], sArray[l + 1])) {
                for (int j = 0; j < sArray.length - 1; j++){
                    if(isUpperAndLowerCaseEqual(sArray[j], sArray[j+1])){
                        i = j;
                        break;
                    }
                    i++;
                }
            }
            else {
                i++;
            }

        }
        StringBuffer sb = new StringBuffer(); // Array string in variable string
        for (String srt : sArray) {
            sb.append(srt);
        }

        String str = sb.toString();
        return  str;

    }

    static boolean isUpperAndLowerCaseEqual(String i, String iPlus){
        if (isUpperCase(i) && isLowerCase(iPlus) && i.equalsIgnoreCase(iPlus)){
            return true;
        }
        else {return isUpperCase(iPlus) && isLowerCase(i) && iPlus.equalsIgnoreCase(i);}
    }

    static boolean isUpperCase(String letter){
        return Objects.equals(letter, letter.toUpperCase());
    }
    static boolean isLowerCase(String letter){
        return Objects.equals(letter, letter.toLowerCase());
    }

}



