package devskill;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/17/2017.
 */
public class LogicMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for(int t = 0;t<testCase;t++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }

            int sum = 0;

            for(int i = 0;i<n;i++)
            {
                sum |= a[i];
            }
            System.out.println("Case "+(t+1)+": "+sum);

        }
    }
}
