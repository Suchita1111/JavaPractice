package Assignments;
import java.util.Arrays;
public class isStringAnagram {
    public static void main(String[] args)
    {
        String word1 = "listen";
        String word2 = "silent";
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if(word1.length() == word2.length())
        {
            char[] arrayWord1 = word1.toCharArray();
            char[] arrayWord2 = word2.toCharArray();

            Arrays.sort(arrayWord1);
            Arrays.sort(arrayWord2);

            boolean strAnagram = Arrays. equals(arrayWord1, arrayWord2);
            //System.out.println(strAnagram);
            if(strAnagram)
                {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
                }
            else
            {
                System.out.println(word1 + " and " + word2 + " are not anagrams. Same length but different character");
            }
        }
        else
        {
            System.out.println(word1 + " and " + word2 + " are not anagrams. Different length");
        }
    }
    
}
