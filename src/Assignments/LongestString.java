package Assignments;

public class LongestString {
    public static void main(String[]args){
        String arr[] = {"Suchita", "Pratik", "Priyanka", "Sunny"};

        String LongString="";

        for(String str :arr)
        {
            if(str.length()>LongString.length())
            {
                LongString = str;
            }

        }
        System.out.println("Longest String is " + LongString );

    }

}
