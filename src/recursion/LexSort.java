package recursion;

import java.util.ArrayList;
import java.util.List;

class LexSort
{
   static ArrayList<String> list=new ArrayList<String>();
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        
        findStringPowerSet("ABC", "", 0);
        return list;
    }
    private static void findStringPowerSet(String a, String curr, int i) {
		
		if(i >=a.length()){
		    list.add(curr);
		
			return;
		}
		findStringPowerSet(a, curr, i + 1);
		findStringPowerSet(a, curr + a.charAt(i), i + 1);

	}
}