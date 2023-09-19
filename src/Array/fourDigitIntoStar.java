package Array;

public class fourDigitIntoStar {
    public static void main(String[]args)
    {
        String phoneNum = "98-00-67-4651";
           String [] splitNum=phoneNum.split("-");
       // System.out.println(splitNum[5]);
           for(int i=0;i<=splitNum.length-1;i++)
           {

               String splitlastfour = splitNum[i].replace('4','*');
               System.out.println(splitNum[i]);


           }


    }
}
