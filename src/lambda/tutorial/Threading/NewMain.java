package lambda.tutorial.Threading;

public class NewMain {


    public static int solve(int penalty, String A, String B) {
        int n = A.length();
        int m = B.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = n; i >= 0; i--) {
            for (int j = m; j >= 0; j--) {

                if (i == n && j == m) {
                    dp[i][j] = 0;
                }
                else if (i == n) {
                    int len = m - j;
                    dp[i][j] = len * len;
                }
                else if (j == m) {
                    int len = n - i;
                    dp[i][j] = len * len;
                }
                else {
                    int ans = Integer.MAX_VALUE;

                    int cost = (A.charAt(i) == B.charAt(j)) ? 0 : penalty;
                    ans = Math.min(ans, cost + dp[i + 1][j + 1]);

                    int len = 0;
                    for (int k = i; k < n; k++) {
                        len++;
                        ans = Math.min(ans, len * len + dp[k + 1][j]);
                    }

                    len = 0;
                    for (int k = j; k < m; k++) {
                        len++;
                        ans = Math.min(ans, len * len + dp[i][k + 1]);
                    }

                    dp[i][j] = ans;
                }
            }
        }

        return dp[0][0];
    }


    public static void main(String[] args) {

        Runnable myWork = new MyWork();

       Thread t1 = new Thread(myWork);

       t1.start();;


       for(;;){
           System.out.println(Thread.currentThread().getName());
           System.out.println(Thread.currentThread().getState());
       }
    }
}
