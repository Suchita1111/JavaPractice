public class Reverse {
    public static void main(String[] args)
    {
       int number= 123;
       int reverse=0;

        while(number!=0)
        {

            int remainder = number % 10;//3,2,1
            reverse = reverse * 10 + remainder;//3,
            number = number /10;//number 1st- 123,2nd-12,3rd-1
        }
        System.out.println(reverse);

    }
}
