package DuplicateElement;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElem {
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
        for (Integer num : Number)
        {
            boolean addNum = notDuplicatenum.add(num);
            if(addNum == false)
            {
                System.out.println(num +" is duplicate number in arraylist");
                Number.remove(num);
            }
            System.out.println(num);

        }
        System.out.println(Number);


    }
}
