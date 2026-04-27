class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i :nums){
            if(!set.add(i)) return true;
            else set.add(i);
        }
        return false;
    }
}