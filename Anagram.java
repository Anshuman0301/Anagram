package JavaCodes;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1 :-");
        String s1=sc.nextLine();
        System.out.println("Enter the string 2 :-");
        String s2=sc.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length() != s2.length())
        {
            System.out.println("Strings are not anagram");
        }
        else
        {
            char[] String1 = s1.toCharArray();
            char[] String2 = s2.toCharArray();

            Arrays.sort(String1);
            Arrays.sort(String2);

            if(Arrays.equals(String1, String2) == true)
            {
                System.out.println("Strings are anagram");
            }
            else
            {
                System.out.println("Strings are not anagram");
            }
        }

    }
}
