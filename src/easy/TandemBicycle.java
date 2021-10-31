package easy;

import java.util.Arrays;

public class TandemBicycle {
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        int totalSpeed = 0;
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        if (fastest) {
            for (int i = 0, j = redShirtSpeeds.length - 1, tmp; i < j; i++, j--) {
                tmp = redShirtSpeeds[i];
                redShirtSpeeds[i] = redShirtSpeeds[j];
                redShirtSpeeds[j] = tmp;
            }
            for (int i = 0; i <= redShirtSpeeds.length - 1; i++) {
                if (redShirtSpeeds[i] >= blueShirtSpeeds[i]) {
                    totalSpeed = totalSpeed + redShirtSpeeds[i];
                    System.out.println("True Red = " + redShirtSpeeds[i]);
                } else {
                    totalSpeed = totalSpeed + blueShirtSpeeds[i];
                    System.out.println("True Blue = " + blueShirtSpeeds[i]);
                }
            }
        } else {
            for (int i = 0; i <= redShirtSpeeds.length - 1; i++) {
                if (redShirtSpeeds[i] >= blueShirtSpeeds[i]) {
                    totalSpeed = totalSpeed + redShirtSpeeds[i];
                    System.out.println("false Red = " + redShirtSpeeds[i]);
                } else {
                    totalSpeed = totalSpeed + blueShirtSpeeds[i];
                    System.out.println("false Blue = " + blueShirtSpeeds[i]);
                }
            }

        }
        return totalSpeed;
    }
}
