import java.util.Objects;

public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrom(121));
    }

    static boolean isPalindrom(int x){
        String[] stringX = Objects.toString(x).split(""); // Put digit in string array
        String[] stringXBackword = new String[stringX.length]; // Will put backward stringX
        for (int i = stringX.length - 1, j = 0; i > 0.; i--, j++){ // Backward stringX in stringXBackword
               stringXBackword[j] = stringX[i];
        }

        for (int i = 0; i < stringX.length - 1; i++){ // If elements in arrays are same
            if (!Objects.equals(stringX[i], stringXBackword[i])){
                return false;
            }
        }
        return true;
    }

}


