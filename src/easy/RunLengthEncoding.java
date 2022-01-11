package easy;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {
    public String runLengthEncoding(String string) {
        Map<Character, Integer> data = new HashMap<>();
        char[] chars = new char[string.length()];

        for(int i = 0; i < chars.length; i++){
            chars[i] = string.charAt(i);
            data.put(string.charAt(i),0);
        }

        for(char ch : chars){
            if(data.containsKey(ch)){
                data.put(ch,data.get(ch)+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : data.keySet()){
            sb.append(data.get(ch)+ch);
        }
        return sb.toString();
    }
}
