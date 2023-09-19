package Assignments;

public class highestNumber {
    public static void main(String[]args)
    {
        int arr[] = {12,25,115,3};
        int smallestNum=arr[0];
        int highestNum=arr[0];

        for(int num:arr)
        {
            if(num >highestNum)
            {
                highestNum = num;
            }  else if (num< smallestNum) {
                smallestNum = num;
            }

        }
        System.out.println("Smallest Number in given Array is : " + smallestNum);
        System.out.println("Highest Number in given Array is : " + highestNum);

    }
}
