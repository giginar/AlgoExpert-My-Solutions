package easy;

public class PolindromeCheck {
    public static boolean isPalindrome(String str) {
        boolean isTrue = false;
        char[] chars = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            chars[i] = str.charAt(i);
        }
        int begin = 0;
        int end = str.length()-1;
        while(end>=begin){
            if(chars[begin] ==  chars[end]){
                isTrue = true;
            }else{
                isTrue = false;
                break;
            }
            begin ++;
            end --;
        }

        return isTrue;
    }
}
