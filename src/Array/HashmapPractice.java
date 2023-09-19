package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapPractice {
    public static <Interger> void main(String[] args)
    {
        HashMap<Integer,String> studentsMap = new HashMap<>();
        studentsMap.put(1,"Suchita");
        studentsMap.put(2,"Arya");
        studentsMap.put(3,"Trisha");
        studentsMap.put(4,"Kiran");

        String studentDetails = studentsMap.get(4);
        //System.out.println(studentDetails);
        //studentsMap.clear();
       // System.out.println(studentsMap.containsValue("Arya"));
        //studentsMap.replace(4,"Trisha");
        //System.out.println(studentsMap);
        System.out.println(studentsMap.remove(2, "Arya"));
        System.out.println(studentsMap);
        //Ways to Iterate over HashMap
        //1 keyset
        Set<Integer> setOfKeys = studentsMap.keySet();
        for(Integer keys : setOfKeys)
        {
            System.out.println("Key is " + keys + " Value is " + studentsMap.get(keys));
        }
        //2 entryset
        Set<Map.Entry<Integer,String>> entries = studentsMap.entrySet();
        for(Map.Entry<Integer,String> entry : entries)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
