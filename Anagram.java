import java.util.*;

public class Anagram {
    static int total = 256;
    public static boolean anagram(char[] a, char[] b){
        int[] count1 = new int[total],count2 = new int[total];
        Arrays.fill(count1,0);
        Arrays.fill(count2,0);
        if(a.length != b.length){
            return false;
        }
        for(int i = 0;i < a.length;i++){
            count1[a[i]]++;
            count2[b[i]]++;
        }
        for(int i = 0;i < total; i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        String s1 = ps.next(),s2 = ps.next();
        char[] ch1 = (s1).toCharArray(),ch2 = (s2).toCharArray();
        if(anagram(ch1,ch2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Input:
// s1 = "listen"
// s2 = "silent"
// Output:
// True
// Explanation: Both the strings are anagrams of each other.
// Therefore, the output is True.
// Input:
// s1 = "hello"
// s2 = "world"
// Output:
// False
// Explanation: Both the strings are not anagrams of each other.
// Therefore, the output is False.
