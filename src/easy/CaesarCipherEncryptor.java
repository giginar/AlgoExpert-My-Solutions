package easy;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipherEncryptor {
    //Given a non-empty string of lowercase letters and a non-negative integer representing a key,
    //write a function that returns a new string obtained by shifting every letter in the input
    //string by k positions in the alphabet, where k is the key.
    public static String caesarCypherEncryptor(String str, int key) {
        int newKey = key % 26;

        List<Integer> intsOfString = new ArrayList<>();

        for (int i = 0; i<str.length();i++) {
            char ch = str.charAt(i);
            int int_char = (int) ch;
            intsOfString.add(int_char + newKey);
        }

        for (int i = 0; i<intsOfString.size() ; i++){
            if(intsOfString.get(i)>122){
                int temp = Integer.valueOf(intsOfString.get(i)) - 26;
                intsOfString.set(i,temp);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : intsOfString){
            String s = Character.toString((char)i);
            sb.append(s);
        }

        return sb.toString();
    }
}
