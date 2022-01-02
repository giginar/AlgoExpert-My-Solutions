package easy;

public class NthFibonacci {
    public static int getNthFib(int n) {
        int number = 0;
        int numberToExtract = 0;
        if(n<=1){
            number = 0;
        }
        if(n==2){
            number = 1;
        }
        if(n>2){
            number = getNthFib(n-1)+getNthFib(n-2);
        }
        return number;
    }
}
