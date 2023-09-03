package Vakil;

import java.util.*;
public class Anagram {

    static int no = 256;
    static boolean areAnagram(char str1[], char str2[])
    {
        int count1[] = new int[no];
        Arrays.fill(count1, 0);
        int count2[] = new int[no];
        Arrays.fill(count2, 0);
        int i;
        for (i = 0; i < str1.length && i < str2.length;
             i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        System.out.println(count1)
        if (str1.length != str2.length)
            return false;
        for (i = 0; i < no; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
    public static void main(String args[])
    {
        Scanner ps = new Scanner(System.in);
         int n = ps.nextInt();
        int n = 1;
        for(int i = 0;i<n;i++){
             String s1 = ps.next();
             String s2 = ps.next();
            char str1[] = (s1).toCharArray();
            char str2[] = (s2).toCharArray();
            if (areAnagram(str1, str2))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

