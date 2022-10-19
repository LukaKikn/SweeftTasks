//მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან.
// დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი
// და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
//Int notContains(Int[] array);

import java.util.Arrays;

public class Contains {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 3, 5, 6, 7, 10};
        System.out.println(notContains(arr));
    }
    private static int notContains(int[] arr){
        Arrays.sort(arr);
        for (int j = 1; j < arr.length; j++) {
            if (arr[0]!= 1) {
                return 1;
            }else
                for (int i = 1; i < arr.length; i++) {
                    if ((arr[i] - arr[i+1]) > 1 || (arr[i+1] - arr[i]) > 1 ) {
                        return arr[i] + 1;
                    }
                }
        }
        return 0;
    }

}
