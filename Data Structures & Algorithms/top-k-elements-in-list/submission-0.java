class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            int j= map.getOrDefault(i, 0);
            map.put(i,j+1);
        }
        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
    (a, b) -> b.getValue().compareTo(a.getValue()));


maxHeap.addAll(map.entrySet());
int[] result= new int[k];
int a=0;
while(!maxHeap.isEmpty() && a<k){
    result[a]=maxHeap.poll().getKey();
    System.out.println(result[a]);
    a++;
}
            return result;
      
    }
}
