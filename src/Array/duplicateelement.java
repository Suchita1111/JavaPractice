package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class duplicateelement {
    public static void main(String[] args)
    {
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(3);
        Number.add(2);
        //  System.out.println(Number);
        HashSet<Integer> notDuplicatenum = new HashSet<>();

        //System.out.println(notDuplicatenum +" is not duplicate number in arraylist");
        for(int i= 0; i<=Number.size()-1;i++)
        {
            if(notDuplicatenum.add(Number.get(i))== false)
           {
               System.out.println(Number.get(i) +" is not duplicate number in arraylist");
                Number.remove(Number.get(i));
                i--;
           }

        }
        System.out.println(Number);

//        for (Integer num : Number)
//        {
//            boolean addNum = notDuplicatenum.add(num);
//            if(addNum == false)
//            {
//                System.out.println(num +" is duplicate number in arraylist");
//                Number.remove(num);
//            }
//            System.out.println(num);
//
//        }
        //System.out.println(Number);


    }
}
