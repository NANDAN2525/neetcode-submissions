
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Long> data=Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
                    var result= data.entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue())).limit(k).mapToInt(e->e.getKey());
                            return result.toArray();
                                }
                                }
