package easy;

public class GenerateDocument {
    //You are given a string of available characters and a string representing a document
    //that you need to generate. Write a function that determines if you can generate the document using the available
    //characters. If you can generate the document, your function should return true,
    //otherwise, it should return false.
    public boolean generateDocument(String characters, String document) {
        boolean isTrue = true;

        for(int i = 0; i<document.length(); i++){
            char ch = document.charAt(i);
            int charactersCounter = countOfCharacter(characters,ch);
            int documentCounter = countOfCharacter(document,ch);
            if(documentCounter > charactersCounter){
                isTrue = false;
            }
        }
        return isTrue;
    }

    public static int countOfCharacter(String string, char ch){
        int counter = 0;
        for(int i = 0; i<string.length(); i++){
            if(ch == string.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
}
