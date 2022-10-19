import java.util.Scanner;

//გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
// დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
public class Variants {

    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of stairs: ");
        int n = sc.nextInt();
        System.out.println(countVariants(n));
    }
    private static int countVariants(int n)
    {
        if ( n <= 0 ){
            return 0;
        } else if ( n < 2 ) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else{
            return countVariants(n-1) + countVariants(n-2);
        }

    }

}
