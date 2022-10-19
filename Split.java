//გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია,
// რომელსაც გადაეცემა თანხა (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას,
// რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
public class Split {

    public static void main (String[] args)
    {
        int[] coins = {1, 5, 10, 20, 50};
        int m = coins.length;
        int V = 150;
        System.out.println ( "Minimum coins required is " + minCoins(coins, m, V));
    }

    private static int minCoins(int[] coins, int m, int V) {

        int[] table = new int[V + 1];
        table[0] = 0;
        for (int i = 1; i <= V; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) {
                        table[i] = sub_res + 1;
                    }
                }
        }
        return table[V];
    }

}
