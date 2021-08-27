package string;

import java.util.HashMap;

//https://leetcode.com/problems/number-of-matching-subsequences/
//Revisit to see Trie solution

class NoOfMatchingSubSequence {
    public int numMatchingSubseq(String s, String[] words) {
        int res=0;
        HashMap<String,Boolean> map=new HashMap();
        for(String s2:words){
           if(map.containsKey(s2)){
     
               if(map.get(s2)){
                 
                   res++;
               }
               continue;
           }
            if(isSubsequence(s,s2)){
                map.put(s2,true);
                res++;
            }
            else{
             map.put(s2,false);
            }
        }
        return res;
    }
    
    public boolean isSubsequence(String s1,String s2){
        
        if(s2.length()>s1.length())
            return false;
        
        if(s1=="")
            return true;
        int i=0;
        int j=0;
        while(i<s2.length()){
            while(j<s1.length() && s2.charAt(i)!=s1.charAt(j)){
                j++;
            }
            if(j==s1.length())
                return false;
            i++;
            j++;
        }
        if(i==s2.length())
            return true;
        return false;
    }
}