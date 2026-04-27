class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new LinkedHashMap<>();
        List<List<String>> result= new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);

            // for(int j=i+1;j<strs.length;j++){
            //     if(isAnagram(strs[i],strs[j]) && !list.contains(strs[j])){
            //        list.add(strs[j]);
            //     }
            // }
            // list.add(strs[i]);
            // result.add(list);
        }
        result.addAll((map.values())); 
        return result;
    }
    // static boolean isAnagram(String s1,String s2){
    //     if(s1.length()!=s2.length()) return false;
    //     char[] c1=s1.toCharArray();
    //     char[] c2=s2.toCharArray();
    //     Arrays.sort(c1);
    //     Arrays.sort(c2);
    //     for(int i=0;i<s1.length();i++){
    //         if(c1[i]!=c2[i]) return false;
    //     }
    //     return true;
    // }
}
