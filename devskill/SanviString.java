package devskill;

import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/17/2017.
 */
public class SanviString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        for(int t = 0;t<testCase;t++)
        {
           String  input = sc.nextLine();
           String array[] =input.split(" ");
           int n = array[0].length();
           int m = array[1].length();
           if(n==m)
           {
               boolean flag = true;
               int alphabetFrequency1[] =new int[26];
               int alphabetFrequency2[] =new int[26];
               for(int i = 0;i<n;i++)
               {
                   alphabetFrequency1[array[0].charAt(i)-'a']++;
               }
               for(int i = 0;i<n;i++)
               {
                   alphabetFrequency2[array[1].charAt(i)-'a']++;
               }
               for(int i = 0;i<26;i++)
               {
                   if(alphabetFrequency1[i]!= alphabetFrequency2[i])
                   {
                       flag = false;
                   }
               }

               if(flag)
               {
                   System.out.println("Yes");
               }
               else
               {
                   System.out.println("No");
               }
           }
           else
           {
               System.out.println("No");
           }

        }
    }
}
