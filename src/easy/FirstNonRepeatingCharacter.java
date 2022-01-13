package easy;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter(String string) {
        //Write a function that takes in a string of lowercase English-alphabet letters
        //and returns the index of the string's first non-repeating character.
        int returnIndex = -1;
        for(int i = 0; i < string.length(); i++){
            for(int j = 1; j < string.length(); j++){
                if(i == j){
                    continue;
                }
                char ch = string.charAt(i);
                if(ch == string.charAt(j)){
                    continue;
                }else{
                    return i;
                }
            }
        }
        return returnIndex;
    }
}
